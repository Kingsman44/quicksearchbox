package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import com.google.android.libraries.web.profile.p3431a.p3434b.C44044g;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44050m;
import java.util.concurrent.TimeUnit;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.profile.a.b.a.ak */
/* compiled from: PG */
public final class C43998ak {

    /* renamed from: a */
    private static final long f114528a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final long f114529b = TimeUnit.DAYS.toMillis(1);

    /* renamed from: a */
    public static final long m77670a(C44009av avVar) {
        C44050m mVar = C44050m.UNSPECIFIED_VERIFY_COOKIES_RESULT;
        C44044g gVar = C44044g.UNSPECIFIED_REFRESH_COOKIES_RESULT;
        C44009av avVar2 = C44009av.UNDEFINED;
        int ordinal = avVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return f114528a;
        }
        if (ordinal == 2) {
            return f114529b;
        }
        if (ordinal == 4) {
            return 0;
        }
        int i = avVar.f114561f;
        throw new AssertionError("Unhandled DelayType: " + i);
    }

    /* renamed from: b */
    public static final long m77671b(C44010aw awVar) {
        long j = awVar.f114565b;
        C44009av a = C44009av.m77693a(awVar.f114566c);
        if (a == null) {
            a = C44009av.UNDEFINED;
        }
        C69664n.m101060f(a, "nextAutomaticSignInDelayType");
        return j + m77670a(a);
    }

    /* renamed from: c */
    public static final C44009av m77672c(C44044g gVar) {
        C69664n.m101061g(gVar, "<this>");
        C44050m mVar = C44050m.UNSPECIFIED_VERIFY_COOKIES_RESULT;
        C44044g gVar2 = C44044g.UNSPECIFIED_REFRESH_COOKIES_RESULT;
        C44009av avVar = C44009av.UNDEFINED;
        switch (gVar.ordinal()) {
            case 0:
            case 3:
            case 5:
            case 6:
                return C44009av.SHORT;
            case 1:
            case 4:
            case 8:
            case 9:
            case 10:
            case 11:
                return C44009av.STANDARD;
            case 2:
                return C44009av.NEVER;
            case 7:
                int i = gVar.f114684m;
                throw new IllegalStateException(i + " should not trigger this path.");
            default:
                throw new C69677g();
        }
    }

    /* renamed from: d */
    public static final C44009av m77673d(C44050m mVar) {
        C69664n.m101061g(mVar, "<this>");
        C44050m mVar2 = C44050m.UNSPECIFIED_VERIFY_COOKIES_RESULT;
        C44044g gVar = C44044g.UNSPECIFIED_REFRESH_COOKIES_RESULT;
        C44009av avVar = C44009av.UNDEFINED;
        switch (mVar.ordinal()) {
            case 0:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return C44009av.NONE;
            case 1:
                return C44009av.STANDARD;
            case 2:
                return C44009av.NEVER;
            case 3:
            case 11:
                int i = mVar.f114705m;
                throw new IllegalStateException(i + " should not trigger this path.");
            case 9:
            case 10:
                return C44009av.SHORT;
            default:
                throw new C69677g();
        }
    }
}
