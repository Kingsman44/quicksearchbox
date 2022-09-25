package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.portable.C19052aa;
import com.google.common.base.C58837ba;
import java.util.Locale;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.cu */
/* compiled from: PG */
public final class C123054cu {

    /* renamed from: a */
    private final boolean f340617a;

    public C123054cu(boolean z) {
        this.f340617a = z;
    }

    /* renamed from: b */
    private static Status m202389b(Status status, String str) {
        return status.withDescription(m202391d(str, "Status", C58837ba.m90858g(status.getDescription())));
    }

    /* renamed from: c */
    private static Status m202390c(C18218av avVar, String str) {
        return Status.f186915m.mo61678e(avVar).withDescription(m202391d(str, String.format(Locale.US, "gallium.StatusException_%d", new Object[]{Integer.valueOf(avVar.f51741a.f178503b)}), avVar.f51741a.f178504c));
    }

    /* renamed from: d */
    private static String m202391d(String str, String str2, String str3) {
        return String.format("%s;%s;%s", new Object[]{str, str2, str3});
    }

    /* renamed from: a */
    public final Status mo105845a(Throwable th, String str) {
        String str2;
        if (!this.f340617a) {
            return Status.f186905c.mo61678e(th).withDescription(m202391d(str, th.getClass().getName(), BuildConfig.FLAVOR));
        }
        if (th instanceof StatusException) {
            return m202389b(((StatusException) th).f186943a, str);
        }
        if (th instanceof C70761fa) {
            return m202389b(((C70761fa) th).f188571a, str);
        }
        if (th instanceof C122872ec) {
            C122872ec ecVar = (C122872ec) th;
            return Status.f186915m.mo61678e(th).withDescription(m202391d(str, ecVar.f340335a, ecVar.f340336b));
        } else if (th instanceof C18218av) {
            return m202390c((C18218av) th, str);
        } else {
            if (th instanceof C19052aa) {
                Throwable cause = th.getCause();
                if (cause instanceof C18218av) {
                    return m202390c((C18218av) cause, str);
                }
                return Status.f186915m.mo61678e(th).withDescription(m202391d(str, "InitException", C58837ba.m90858g(th.getMessage())));
            }
            Status e = Status.f186905c.mo61678e(th);
            String name = th.getClass().getName();
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace == null || stackTrace.length < 2) {
                str2 = "<no stack>";
            } else {
                str2 = String.valueOf(stackTrace[0]) + "," + String.valueOf(stackTrace[1]);
            }
            return e.withDescription(m202391d(str, name, str2));
        }
    }
}
