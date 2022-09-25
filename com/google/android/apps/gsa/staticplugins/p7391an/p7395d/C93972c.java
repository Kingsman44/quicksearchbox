package com.google.android.apps.gsa.staticplugins.p7391an.p7395d;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.d.c */
/* compiled from: PG */
public final class C93972c implements C23113i {

    /* renamed from: a */
    private final C93968a f262443a;

    public C93972c(C93968a aVar) {
        this.f262443a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("DoodleHeaderEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("doodleSearch")) {
                this.f262443a.mo88250e();
            } else if (str.equals("onDoodleViewSwitched_boolean")) {
                this.f262443a.mo88251f(Boolean.valueOf(pVar.f63472a.getBoolean("doodleVisible")).booleanValue());
            } else if (str.equals("openDoodle")) {
                this.f262443a.mo88252h();
            } else if (str.equals("showTooltipOnScroll")) {
                this.f262443a.mo88253i();
            }
        }
    }
}
