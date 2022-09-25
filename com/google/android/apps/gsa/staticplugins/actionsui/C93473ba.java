package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.p8852u.C118573f;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.permissions.C91075b;
import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.android.libraries.p1646ay.C19599a;
import com.google.android.libraries.p1646ay.C19600b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.ba */
/* compiled from: PG */
public final class C93473ba extends C19600b implements C91078e {

    /* renamed from: a */
    private static final C59071e f260867a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actionsui.ba");

    /* renamed from: b */
    private C91075b f260868b;

    /* renamed from: c */
    private Intent f260869c;

    /* renamed from: a */
    public final void mo18206a(String[] strArr, int[] iArr) {
        C19599a aVar;
        try {
            Intent intent = new Intent();
            intent.putExtra("requested_permissions", strArr);
            intent.putExtra("permissions_results", iArr);
            this.f54539k.setResult(-1, intent);
            if (this.f260869c != null) {
                for (int i : iArr) {
                    if (i == -1) {
                        aVar = this.f54539k;
                        break;
                    }
                }
                this.f54539k.startActivity(this.f260869c);
            }
            aVar = this.f54539k;
            aVar.mo24855e();
        } catch (Throwable th) {
            this.f54539k.mo24855e();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo24895b(Bundle bundle) {
        C74504a.m120462a(f.bg);
        this.f54539k.mo24861h(bundle);
    }

    /* renamed from: c */
    public final void mo24896c(int i, String[] strArr, int[] iArr) {
        this.f260868b.mo85347b(i, strArr, iArr);
    }

    /* renamed from: d */
    public final void mo24897d() {
        this.f54539k.mo24866m();
        Intent b = this.f54539k.mo24853b();
        if (b == null) {
            this.f54539k.mo24855e();
            return;
        }
        String[] stringArrayExtra = b.getStringArrayExtra("requested_permissions");
        this.f260869c = (Intent) b.getExtras().getParcelable("permission_completion_intent");
        C19599a aVar = this.f54539k;
        C91090a aVar2 = new C91090a(aVar, aVar, 0);
        this.f260868b = new C91075b(aVar2.f254379a, aVar2);
        int a = C118573f.m196864a(b.getIntExtra("permission_request_source", 0));
        if (a == 0) {
            a = 1;
        }
        if (a == 1) {
            ((C59052c) ((C59052c) f260867a.mo56226d()).mo56372aa(13728)).mo56386p("Missing permissions request source");
        }
        this.f260868b.mo81047ju(stringArrayExtra, a, this);
    }
}
