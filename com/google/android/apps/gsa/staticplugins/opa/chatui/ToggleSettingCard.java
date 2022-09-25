package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.widget.Switch;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.util.C87484f;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.util.C113873da;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58837ba;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;

/* compiled from: PG */
public class ToggleSettingCard extends C108375gj {

    /* renamed from: a */
    public C87484f f300941a;

    /* renamed from: b */
    BroadcastReceiver f300942b;

    /* renamed from: c */
    public C22871g f300943c;

    /* renamed from: n */
    public final C108445iz f300944n = new C108445iz(this);

    /* renamed from: o */
    public Switch f300945o;

    /* renamed from: p */
    String f300946p;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ToggleSettingCard$a */
    /* compiled from: PG */
    public interface C108191a {
        /* renamed from: qG */
        void mo96574qG(ToggleSettingCard toggleSettingCard);
    }

    public ToggleSettingCard(Context context) {
        super(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (((com.google.android.apps.gsa.search.core.p6805i.C86124t) r3.f301428e.mo27525b()).mo79746e(com.google.android.apps.gsa.shared.p7066m.C90014bt.f247185cQ) == false) goto L_0x0097;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96538b(com.google.assistant.p3897e.p3921j.C52131gj r4) {
        /*
            r3 = this;
            super.mo96538b(r4)
            android.widget.Switch r0 = r3.f300945o
            com.google.android.apps.gsa.staticplugins.opa.chatui.iz r1 = r3.f300944n
            r0.setOnCheckedChangeListener(r1)
            boolean r0 = r3.f301436m
            if (r0 == 0) goto L_0x0016
            com.google.android.apps.gsa.staticplugins.opa.chatui.ir r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.ir
            r0.<init>(r3)
            r3.setOnClickListener(r0)
        L_0x0016:
            int r0 = r4.f136791a
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = r4.f136797g
            r3.f300946p = r1
        L_0x0020:
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0031
            java.lang.String r4 = r4.f136792b
            java.lang.String r0 = "enable_wifi_ap"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0031
            r3.f300946p = r0
            goto L_0x0042
        L_0x0031:
            dagger.a r4 = r3.f301428e
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r4 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r4
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247185cQ
            boolean r4 = r4.mo79746e(r0)
            if (r4 != 0) goto L_0x0042
            goto L_0x0097
        L_0x0042:
            java.lang.String r4 = r3.f300946p
            boolean r4 = com.google.common.base.C58837ba.m90859h(r4)
            if (r4 == 0) goto L_0x004b
            goto L_0x0097
        L_0x004b:
            java.lang.String r4 = r3.f300946p
            boolean r0 = com.google.common.base.C58837ba.m90859h(r4)
            if (r0 == 0) goto L_0x0054
            goto L_0x007f
        L_0x0054:
            com.google.protos.an.d.b.p r0 = com.google.protos.p4850an.p4855d.p4857b.C63490p.AIRPLANE_MODE
            java.lang.String r0 = r0.name()
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x007f
            java.lang.String r4 = r3.f300946p
            com.google.protos.an.d.b.p r0 = com.google.protos.p4850an.p4855d.p4857b.C63490p.AIRPLANE_MODE
            java.lang.String r0 = r0.name()
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0075
            java.lang.String r4 = "airplane_mode_on"
            android.net.Uri r4 = android.provider.Settings.Global.getUriFor(r4)
            goto L_0x0076
        L_0x0075:
            r4 = 0
        L_0x0076:
            android.content.ContentResolver r0 = r3.f301431h
            r1 = 0
            android.database.ContentObserver r2 = r3.f301429f
            r0.registerContentObserver(r4, r1, r2)
            goto L_0x0097
        L_0x007f:
            java.lang.String r4 = r3.f300946p
            com.google.protos.an.d.b.p r0 = com.google.protos.p4850an.p4855d.p4857b.C63490p.FLASHLIGHT
            java.lang.String r0 = r0.name()
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0097
            com.google.android.apps.gsa.search.shared.actions.util.f r4 = r3.f300941a
            com.google.android.apps.gsa.staticplugins.opa.chatui.it r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.it
            r0.<init>(r3)
            r4.mo81471b(r0)
        L_0x0097:
            boolean r4 = r3.f301430g
            if (r4 == 0) goto L_0x00b5
            android.widget.ImageView r4 = r3.f301435l
            if (r4 != 0) goto L_0x00a0
            goto L_0x00b5
        L_0x00a0:
            android.content.Context r0 = r3.f301433j
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131166627(0x7f0705a3, float:1.7947505E38)
            int r0 = r0.getDimensionPixelOffset(r1)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            r4.width = r0
            r4.height = r0
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.ToggleSettingCard.mo96538b(com.google.assistant.e.j.gj):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo96539c() {
        ((C108191a) C47266f.m84076a(this.f301433j, C108191a.class)).mo96574qG(this);
    }

    /* renamed from: d */
    public final void mo96540d() {
        Switch switchR = this.f300945o;
        String f = this.f301432i.mo83085f(false);
        boolean z = true;
        if (!"1".equals(f) && !"true".equals(f)) {
            z = false;
        }
        switchR.setChecked(z);
        if (!this.f301436m) {
            this.f300945o.setClickable(false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f300946p;
        if (!C58837ba.m90859h(str)) {
            if (!str.equals("enable_wifi_ap") && !str.equals(C63490p.WIFI.name()) && !str.equals(C63490p.BATTERY_SAVER.name()) && !str.equals(C63490p.BLUETOOTH.name()) && !str.equals(C63490p.DO_NOT_DISTURB.name())) {
                return;
            }
            if (((C86124t) this.f301428e.mo27525b()).mo79746e(C90014bt.f247185cQ) || this.f300946p.equals("enable_wifi_ap")) {
                IntentFilter intentFilter = new IntentFilter();
                if (this.f300946p.equals("enable_wifi_ap")) {
                    intentFilter.addAction(C113873da.f315294a);
                    this.f300942b = new C108440iu(this);
                } else if (this.f300946p.equals(C63490p.WIFI.name())) {
                    intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                    this.f300942b = new C108441iv(this);
                } else if (this.f300946p.equals(C63490p.BATTERY_SAVER.name())) {
                    intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                    this.f300942b = new C108442iw(this);
                } else if (this.f300946p.equals(C63490p.BLUETOOTH.name())) {
                    intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                    intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
                    intentFilter.addAction("android.bluetooth.adapter.action.LOCAL_NAME_CHANGED");
                    this.f300942b = new C108443ix(this);
                } else if (this.f300946p.equals(C63490p.DO_NOT_DISTURB.name())) {
                    intentFilter.addAction("android.app.action.INTERRUPTION_FILTER_CHANGED");
                    this.f300942b = new C108444iy(this);
                }
                this.f301433j.registerReceiver(this.f300942b, intentFilter);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BroadcastReceiver broadcastReceiver = this.f300942b;
        if (broadcastReceiver != null) {
            this.f301433j.unregisterReceiver(broadcastReceiver);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Switch switchR = (Switch) findViewById(R.id.toggle);
        this.f300945o = switchR;
        C28292j jVar = new C28292j(78038);
        jVar.mo33795i(4);
        C28295m.m52919e(switchR, jVar);
    }

    public ToggleSettingCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ToggleSettingCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
