package me.sanjayav.polarbookshop.dispatcherservice;

public record OrderDispatchedMessage(
    Long orderId
) { }