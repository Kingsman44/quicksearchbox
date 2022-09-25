package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.common.base.C58838bb;
import com.google.p375ai.p378b.C7886np;
import com.google.p375ai.p378b.C7891nu;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.ax */
/* compiled from: PG */
public final class C91973ax {

    /* renamed from: a */
    public String f256469a;

    /* renamed from: b */
    public boolean f256470b;

    /* renamed from: c */
    public boolean f256471c;

    /* renamed from: d */
    public List f256472d;

    /* renamed from: e */
    public Intent f256473e;

    /* renamed from: f */
    public boolean f256474f = true;

    /* renamed from: g */
    public int f256475g = 5;

    /* renamed from: h */
    private final C7891nu f256476h;

    /* renamed from: i */
    private final C55912b f256477i = C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN;

    public C91973ax(C7891nu nuVar) {
        this.f256476h = nuVar;
    }

    /* renamed from: a */
    public final Intent mo86664a() {
        Intent intent = new Intent();
        if (this.f256471c) {
            intent.setAction("com.google.android.apps.now.OPT_IN_1P");
            intent.setPackage("com.google.android.googlequicksearchbox");
        } else {
            intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.sidekick.main.optin.OptInActivity");
            if (this.f256474f) {
                intent.addFlags(268468224);
            }
        }
        intent.putExtra("gel_onboard_mode", this.f256470b);
        intent.putExtra("opt_in_source", this.f256476h.f27730O);
        Intent intent2 = this.f256473e;
        if (intent2 != null) {
            intent.putExtra("opt_in_completion_intent", intent2);
        }
        List list = this.f256472d;
        int i = 1;
        if (list != null && !list.isEmpty()) {
            int i2 = this.f256475g;
            C58838bb.m90868c(i2 == 3 || i2 == 5);
            this.f256475g = 3;
            int[] iArr = new int[this.f256472d.size()];
            for (int i3 = 0; i3 < this.f256472d.size(); i3++) {
                iArr[i3] = ((C7886np) this.f256472d.get(i3)).f27679o;
            }
            intent.putExtra("requested_settings", iArr);
        }
        if (this.f256477i != C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN) {
            intent.putExtra("requested_activity_controls_setting", this.f256477i);
        }
        int i4 = this.f256475g;
        if (i4 == 5) {
            this.f256475g = 1;
        } else {
            i = i4;
        }
        if (i != 0) {
            intent.putExtra("opt_in_mode", i);
            if (!TextUtils.isEmpty(this.f256469a)) {
                intent.putExtra("account_name", this.f256469a);
            }
            if (this.f256471c) {
                intent.putExtra("opt_in_first_party_bundle", C90772bp.m148308p(intent.getExtras()));
            }
            return intent;
        }
        throw null;
    }
}
