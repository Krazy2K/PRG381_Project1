CREATE TABLE [dbo].[Booking System] (
  [BookingNumber] [int] IDENTITY (101, 1),
  [EventType] [varchar](50) NOT NULL,
  [EventDate] [date] NOT NULL,
  [EventTime] [time] NOT NULL,
  [VenueAddress] [varchar](max) NOT NULL,
  [NumberOfKids] [int] NOT NULL,
  [NumberOfAdults] [int] NOT NULL,
  [MealTypeAdults] [varchar](50) NOT NULL,
  [MealTypeKids] [varchar](50) NOT NULL,
  [Drinks] [varchar](50) NOT NULL,
  [Deserts] [varchar](50) NOT NULL,
  [ThemeType] [varchar](50) NOT NULL,
  [Name] [varchar](50) NOT NULL,
  [Surname] [varchar](50) NOT NULL,
  [PhoneNumber] [varchar](50) NOT NULL,
  [Cost] [float] NOT NULL,
  [EventConfirmation] [varchar](10) NOT NULL,
  CONSTRAINT [PK_Booking System] PRIMARY KEY CLUSTERED ([BookingNumber])
)
ON [PRIMARY]
TEXTIMAGE_ON [PRIMARY]
GO