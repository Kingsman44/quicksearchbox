package com.google.android.libraries.social.populous.logging;

import android.database.sqlite.SQLiteException;
import com.google.android.gms.auth.C142903e;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62974ct;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.social.populous.logging.l */
/* compiled from: PG */
public final class C42577l {
    /* renamed from: a */
    public static C62722b m75140a(Throwable th) {
        if (th instanceof CancellationException) {
            return C62722b.CANCELLED;
        }
        if (th instanceof TimeoutException) {
            return C62722b.DEADLINE_EXCEEDED;
        }
        if (th instanceof InterruptedException) {
            return C62722b.ABORTED;
        }
        if (th instanceof C142903e) {
            if (th instanceof UserRecoverableAuthException) {
                return C62722b.UNAUTHENTICATED;
            }
            return C62722b.PERMISSION_DENIED;
        } else if (th instanceof IOException) {
            if (th instanceof FileNotFoundException) {
                return C62722b.NOT_FOUND;
            }
            if (th instanceof C62974ct) {
                return C62722b.DATA_LOSS;
            }
            return C62722b.UNAVAILABLE;
        } else if (th instanceof IllegalArgumentException) {
            return C62722b.INVALID_ARGUMENT;
        } else {
            if (th instanceof IllegalStateException) {
                return C62722b.FAILED_PRECONDITION;
            }
            if (th instanceof SecurityException) {
                return C62722b.PERMISSION_DENIED;
            }
            if (th instanceof SQLiteException) {
                switch (C42565ac.m75121a((SQLiteException) th) - 1) {
                    case 3:
                    case 23:
                        return C62722b.PERMISSION_DENIED;
                    case 4:
                    case 9:
                        return C62722b.ABORTED;
                    case 5:
                    case 6:
                    case 14:
                        return C62722b.UNAVAILABLE;
                    case 7:
                    case 13:
                    case 18:
                        return C62722b.RESOURCE_EXHAUSTED;
                    case 8:
                    case 26:
                        return C62722b.FAILED_PRECONDITION;
                    case 11:
                        return C62722b.DATA_LOSS;
                    case 12:
                        return C62722b.NOT_FOUND;
                    case 19:
                        return C62722b.INVALID_ARGUMENT;
                    case 25:
                        return C62722b.OUT_OF_RANGE;
                    default:
                        return C62722b.UNKNOWN;
                }
            } else {
                Status d = Status.m102100d(th);
                if (d.getCode() != Status.Code.UNKNOWN) {
                    return C62722b.m94931a(d.getCode().value());
                }
                if (th.getCause() != null) {
                    return m75140a(th.getCause());
                }
                return C62722b.UNKNOWN;
            }
        }
    }
}
