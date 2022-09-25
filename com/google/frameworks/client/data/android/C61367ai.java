package com.google.frameworks.client.data.android;

import com.google.net.p4726a.p4727a.C62722b;
import java.util.Locale;
import java.util.regex.Pattern;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.ai */
/* compiled from: PG */
public final class C61367ai {
    static {
        new ConcurrentHashMap();
        Pattern.compile("([a-zA-Z0-9]{2,3})_([a-zA-Z0-9]{2,3})?_[a-zA-Z0-9_]*#([a-zA-Z0-9]{4}).*");
        C61362ad.m93870b("Content-Type");
        new C70290cs("Content-Type", C70334de.f187481c);
        new C70290cs("server", C70334de.f187481c);
    }

    /* renamed from: b */
    public static Status.Code m93876b(C62722b bVar) {
        return Status.fromCodeValue(bVar.f169415s).getCode();
    }

    /* renamed from: c */
    public static String m93877c() {
        return Locale.getDefault().toLanguageTag();
    }

    /* renamed from: a */
    public static C62722b m93875a(int i) {
        if (i == 200) {
            return C62722b.OK;
        }
        if (i == 409) {
            return C62722b.ABORTED;
        }
        if (i == 416) {
            return C62722b.OUT_OF_RANGE;
        }
        if (i == 429) {
            return C62722b.RESOURCE_EXHAUSTED;
        }
        if (i == 499) {
            return C62722b.CANCELLED;
        }
        if (i == 501) {
            return C62722b.UNIMPLEMENTED;
        }
        if (i == 400) {
            return C62722b.INVALID_ARGUMENT;
        }
        if (i == 401) {
            return C62722b.UNAUTHENTICATED;
        }
        if (i == 403) {
            return C62722b.PERMISSION_DENIED;
        }
        if (i == 404) {
            return C62722b.NOT_FOUND;
        }
        if (i == 503) {
            return C62722b.UNAVAILABLE;
        }
        if (i == 504) {
            return C62722b.DEADLINE_EXCEEDED;
        }
        if (i >= 200 && i < 300) {
            return C62722b.OK;
        }
        if (i >= 400 && i < 500) {
            return C62722b.FAILED_PRECONDITION;
        }
        if (i < 500 || i >= 600) {
            return C62722b.UNKNOWN;
        }
        return C62722b.INTERNAL;
    }
}
