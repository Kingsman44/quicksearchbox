package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opa.p8306at.C107572o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.fc */
/* compiled from: PG */
public final class C108341fc extends C108232bc {

    /* renamed from: d */
    private static final C59071e f301368d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.fc");

    /* renamed from: a */
    public final String f301369a;

    /* renamed from: b */
    public final String f301370b;

    /* renamed from: c */
    public final String f301371c;

    /* renamed from: e */
    private final Context f301372e;

    /* renamed from: f */
    private C107572o f301373f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C108341fc(android.content.Context r4, com.google.android.apps.gsa.staticplugins.opa.p8306at.C107572o r5) {
        /*
            r3 = this;
            boolean r0 = r5.mo96036j()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.mo96034h()
            goto L_0x000f
        L_0x000b:
            java.lang.String r0 = r5.mo96035i()
        L_0x000f:
            java.lang.String r1 = r5.mo96010a()
            com.google.android.apps.gsa.staticplugins.opa.as.b.a.n r2 = r5.f299285c
            java.lang.String r2 = r2.f299178d
            r3.<init>(r4, r0, r1, r2)
            r3.f301373f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.C108341fc.<init>(android.content.Context, com.google.android.apps.gsa.staticplugins.opa.at.o):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo96802b(LinearLayout linearLayout) {
        Intent launchIntentForPackage = this.f301372e.getPackageManager().getLaunchIntentForPackage(this.f301371c);
        if (launchIntentForPackage != null) {
            try {
                this.f301372e.startActivity(launchIntentForPackage);
            } catch (ActivityNotFoundException unused) {
                C59104x d = f301368d.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MsgNotifHistoryCard");
                ((C59052c) ((C59052c) d).mo56372aa(24012)).mo56389s("Cannot find the activity for package %s", this.f301371c);
                linearLayout.setVisibility(8);
            }
        }
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 55751;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 15;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C28292j jVar = this.f301030l;
        if (jVar != null) {
            return C28293k.m52908e(jVar, new C28293k[0]);
        }
        return C28293k.f76979c;
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        RelativeLayout relativeLayout = blVar.f301096w;
        if (relativeLayout != null) {
            ((TextView) relativeLayout.findViewById(R.id.name)).setText(this.f301372e.getResources().getString(R.string.read_notification_msg_history_card_sent_to_with_name, new Object[]{this.f301369a}));
            ((TextView) blVar.f301096w.findViewById(R.id.message)).setText(this.f301370b);
            LinearLayout linearLayout = (LinearLayout) blVar.f301096w.findViewById(R.id.app_btn_with_text_container);
            ImageButton imageButton = (ImageButton) blVar.f301096w.findViewById(R.id.app_btn_icon);
            TextView textView = (TextView) blVar.f301096w.findViewById(R.id.app_btn_text);
            try {
                Drawable applicationIcon = this.f301372e.getPackageManager().getApplicationIcon(this.f301371c);
                String obj = this.f301372e.getPackageManager().getApplicationLabel(this.f301372e.getPackageManager().getApplicationInfo(this.f301371c, 0)).toString();
                imageButton.setImageDrawable(applicationIcon);
                textView.setText(this.f301372e.getResources().getString(R.string.read_notification_history_card_app_btn_text, new Object[]{obj}));
                linearLayout.setOnClickListener(new C108340fb(this, linearLayout));
            } catch (PackageManager.NameNotFoundException unused) {
                C59104x d = f301368d.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MsgNotifHistoryCard");
                ((C59052c) ((C59052c) d).mo56372aa(24013)).mo56389s("Package name %s cannot be found!", this.f301371c);
                linearLayout.setVisibility(8);
            }
        }
    }

    /* renamed from: q */
    public final void mo96607q(int i) {
        C107572o oVar;
        this.f301034p = i;
        if (i == 1 && (oVar = this.f301373f) != null) {
            oVar.f299288f = true;
        }
    }

    public C108341fc(Context context, String str, String str2, String str3) {
        super((byte[]) null);
        this.f301372e = context;
        this.f301369a = str;
        this.f301370b = str2;
        this.f301371c = str3;
    }
}
