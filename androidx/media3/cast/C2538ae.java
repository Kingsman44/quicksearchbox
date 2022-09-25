package androidx.media3.cast;

import com.google.android.gms.common.api.C143843o;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import java.util.Locale;

/* renamed from: androidx.media3.cast.ae */
/* compiled from: PG */
final class C2538ae {
    /* renamed from: a */
    public static String m6740a(int i) {
        if (i == 0) {
            return "Success.";
        }
        if (i == 2100) {
            return "The in-progress request failed.";
        }
        if (i == 2103) {
            return "The request's progress is no longer being tracked because another request of the same type has been made before the first request completed.";
        }
        if (i == 7) {
            return "Network I/O error.";
        }
        if (i == 8) {
            return "An internal error has occurred.";
        }
        if (i == 2200) {
            return "The Cast Remote Display service could not be created.";
        }
        if (i == 2201) {
            return "The Cast Remote Display service was disconnected.";
        }
        switch (i) {
            case 13:
                return "An unknown, unexpected error has occurred.";
            case 14:
                return "A blocking call was interrupted while waiting and did not run to completion.";
            case 15:
                return "An operation has timed out.";
            default:
                switch (i) {
                    case SimpleSnackbar.LENGTH_SHORT /*2000*/:
                        return "Authentication failure.";
                    case 2001:
                        return "An invalid request was made.";
                    case 2002:
                        return "An in-progress request has been canceled, most likely because another action has preempted it.";
                    case 2003:
                        return "The request was disallowed and could not be completed.";
                    case 2004:
                        return "A requested application could not be found.";
                    case 2005:
                        return "A requested application is not currently running.";
                    case 2006:
                        return "A message could not be sent because it is too large.";
                    case 2007:
                        return "A message could not be sent because there is not enough room in the send buffer at this time.";
                    default:
                        if (i < -999 || i > 999) {
                            if (i < 2000 || i > 2099) {
                                if (i >= 2100 && i <= 2109) {
                                    return String.format(Locale.ROOT, "%s %d", new Object[]{"Media control channel status code", Integer.valueOf(i)});
                                } else if (i >= 2150 && i <= 2169) {
                                    return String.format(Locale.ROOT, "%s %d", new Object[]{"Cast session status code", Integer.valueOf(i)});
                                } else if (i >= 2200 && i <= 2219) {
                                    return String.format(Locale.ROOT, "%s %d", new Object[]{"Cast remote display status code", Integer.valueOf(i)});
                                } else if (i >= 2250 && i <= 2289) {
                                    return String.format(Locale.ROOT, "%s %d", new Object[]{"Cast socket status code", Integer.valueOf(i)});
                                } else if (i >= 2300 && i <= 2309) {
                                    return String.format(Locale.ROOT, "%s %d", new Object[]{"Cast service status code", Integer.valueOf(i)});
                                } else if (i >= 2310 && i <= 2319) {
                                    return String.format(Locale.ROOT, "%s %d", new Object[]{"Endpoint switch status code", Integer.valueOf(i)});
                                } else if (i >= 2350 && i <= 2359) {
                                    return String.format(Locale.ROOT, "%s %d", new Object[]{"Cast multizone device status code", Integer.valueOf(i)});
                                } else if (i >= 2400 && i <= 2419) {
                                    return String.format(Locale.ROOT, "%s %d", new Object[]{"Cast relay casting status code", Integer.valueOf(i)});
                                } else if (i >= 2450 && i <= 2469) {
                                    return String.format(Locale.ROOT, "%s %d", new Object[]{"Cast nearby casting status code", Integer.valueOf(i)});
                                } else if (i >= 2470 && i <= 2479) {
                                    return String.format(Locale.ROOT, "%s %d", new Object[]{"Cast application status code", Integer.valueOf(i)});
                                } else if (i < 2490 || i > 2499) {
                                    return String.format(Locale.ROOT, "Unknown cast status code %d", new Object[]{Integer.valueOf(i)});
                                } else {
                                    return String.format(Locale.ROOT, "%s %d", new Object[]{"Cast media loading status code", Integer.valueOf(i)});
                                }
                            } else if (i == 2015) {
                                return "TCP_PROBER_FAIL_TO_VERIFY_DEVICE";
                            } else {
                                switch (i) {
                                    case SimpleSnackbar.LENGTH_SHORT /*2000*/:
                                        return "AUTHENTICATION_FAILED";
                                    case 2001:
                                        return "INVALID_REQUEST";
                                    case 2002:
                                        return "CANCELED";
                                    case 2003:
                                        return "NOT_ALLOWED";
                                    case 2004:
                                        return "APPLICATION_NOT_FOUND";
                                    case 2005:
                                        return "APPLICATION_NOT_RUNNING";
                                    case 2006:
                                        return "MESSAGE_TOO_LARGE";
                                    case 2007:
                                        return "MESSAGE_SEND_BUFFER_TOO_FULL";
                                    default:
                                        return String.format(Locale.ROOT, "%s %d", new Object[]{"Common cast status code", Integer.valueOf(i)});
                                }
                            }
                        } else if (i == 0) {
                            return "SUCCESS";
                        } else {
                            if (i == 7) {
                                return "NETWORK_ERROR";
                            }
                            if (i != 14) {
                                return i != 15 ? C143843o.m233808a(i) : "TIMEOUT";
                            }
                            return "INTERRUPTED";
                        }
                }
        }
    }
}
