package com.google.android.libraries.mdi.download.p2254i;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.feedback.C144205j;
import com.google.android.gms.feedback.C144207l;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import java.util.IllegalFormatException;

/* renamed from: com.google.android.libraries.mdi.download.i.a */
/* compiled from: PG */
public final class C29657a implements C29658ia {

    /* renamed from: a */
    private final Context f80311a;

    /* renamed from: b */
    private final C28787cb f80312b;

    public C29657a(Context context, C28787cb cbVar) {
        this.f80311a = context;
        this.f80312b = cbVar;
    }

    /* renamed from: a */
    public final void mo34497a(Throwable th, String str, Object... objArr) {
        if (this.f80312b.mo34411A() && C29045l.m53929a((long) this.f80312b.mo34434n())) {
            try {
                str = String.format(str, objArr);
            } catch (IllegalFormatException e) {
                C29045l.m53938j(e, "Bad format string or format arguments: %s", str);
            }
            C144207l lVar = new C144207l();
            lVar.f390629h = new ApplicationErrorReport();
            lVar.f390629h.crashInfo = new ApplicationErrorReport.CrashInfo();
            lVar.f390629h.crashInfo.throwLineNumber = -1;
            lVar.f390629h.crashInfo = new ApplicationErrorReport.CrashInfo(th);
            lVar.f390624c = "com.google.android.gms.icing.SILENT_FEEDBACK";
            lVar.f390623b = str;
            lVar.f390625d = true;
            C143919bh.m233958a(lVar.f390629h.crashInfo.exceptionClassName);
            C143919bh.m233958a(lVar.f390629h.crashInfo.throwClassName);
            C143919bh.m233958a(lVar.f390629h.crashInfo.throwMethodName);
            C143919bh.m233958a(lVar.f390629h.crashInfo.stackTrace);
            if (TextUtils.isEmpty(lVar.f390629h.crashInfo.throwFileName)) {
                lVar.f390629h.crashInfo.throwFileName = "unknown";
            }
            FeedbackOptions a = lVar.mo119741a();
            a.f390567d.crashInfo = lVar.f390629h.crashInfo;
            a.f390570g = "com.google.android.gms.icing";
            C144205j.m234448e(this.f80311a).mo119739c(a);
        }
    }
}
