package com.google.android.libraries.assistant.contexttrigger.p1460d;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.libraries.assistant.contexttrigger.C17810l;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17643g;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17687a;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.aa */
/* compiled from: PG */
public final class C17660aa extends BroadcastReceiver implements C17810l {

    /* renamed from: a */
    public static final C59071e f50797a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.d.aa");

    /* renamed from: b */
    public final C17643g f50798b;

    /* renamed from: c */
    private final Context f50799c;

    /* renamed from: d */
    private final C17684y f50800d;

    public C17660aa(Context context, C17643g gVar, C17684y yVar) {
        this.f50799c = context;
        this.f50798b = gVar;
        this.f50800d = yVar;
    }

    /* renamed from: a */
    public final C60870cx mo23422a() {
        C59071e eVar = f50797a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(46987)).mo56386p("Registering headset state trigger source");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        if (this.f50800d.mo23429f(this.f50799c)) {
            intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        } else {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(46988)).mo56386p("HeadsetState: Bluetooth permissions denied. Can only detect wired headsets.");
        }
        this.f50799c.registerReceiver(this, intentFilter);
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final C60870cx mo23423b() {
        ((C59052c) ((C59052c) f50797a.mo56224b()).mo56372aa(46989)).mo56386p("Un-registering headset state trigger source");
        this.f50799c.unregisterReceiver(this);
        return C60866ct.f164955a;
    }

    public final void onReceive(Context context, Intent intent) {
        C60870cx cxVar;
        C17684y yVar = this.f50800d;
        String action = intent.getAction();
        if (yVar.mo23430i(intent)) {
            C17687a a = yVar.mo23427a();
            C17689c cVar = C17689c.CONNECTED;
            a.copyOnWrite();
            C17692f fVar = (C17692f) a.instance;
            C17692f fVar2 = C17692f.f50858f;
            fVar.f50861b = cVar.f50850d;
            fVar.f50860a |= 1;
            C17691e eVar = C17691e.WIRED;
            a.copyOnWrite();
            C17692f fVar3 = (C17692f) a.instance;
            fVar3.f50862c = eVar.f50857e;
            fVar3.f50860a |= 4;
            cxVar = C60856cj.m92900i(Optional.m71637of((C17692f) a.build()));
        } else {
            if (C17684y.m34961j(intent)) {
                if (!yVar.mo23429f(yVar.f50840b)) {
                    ((C59052c) ((C59052c) C17684y.f50839a.mo56226d()).mo56372aa(46967)).mo56386p("extractHeadsetState(): No permissions, wired headset disconnected.");
                    C17687a a2 = yVar.mo23427a();
                    C17691e eVar2 = C17691e.UNKNOWN;
                    a2.copyOnWrite();
                    C17692f fVar4 = (C17692f) a2.instance;
                    C17692f fVar5 = C17692f.f50858f;
                    fVar4.f50862c = eVar2.f50857e;
                    fVar4.f50860a |= 4;
                    C17689c cVar2 = C17689c.DISCONNECTED;
                    a2.copyOnWrite();
                    C17692f fVar6 = (C17692f) a2.instance;
                    fVar6.f50861b = cVar2.f50850d;
                    fVar6.f50860a |= 1;
                    cxVar = C60856cj.m92900i(Optional.m71637of((C17692f) a2.build()));
                } else {
                    ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46966)).mo56386p("getBluetoothHeadsetState(): wired headset d/ced.");
                }
            } else if (!yVar.mo23429f(yVar.f50840b)) {
                ((C59052c) ((C59052c) C17684y.f50839a.mo56226d()).mo56372aa(46965)).mo56386p("extractHeadsetState(): No permissions");
                cxVar = C60856cj.m92900i(Optional.empty());
            } else {
                String str = "ERROR";
                if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", LinearLayoutManager.INVALID_OFFSET);
                    C59052c cVar3 = (C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46964);
                    switch (intExtra) {
                        case 10:
                            str = "STATE_OFF";
                            break;
                        case 11:
                            str = "STATE_TURNING_ON";
                            break;
                        case 12:
                            str = "STATE_ON";
                            break;
                        case 13:
                            str = "STATE_TURNING_OFF";
                            break;
                    }
                    cVar3.mo56389s("Bluetooth setting toggled. State:[%s]", str);
                    C17687a a3 = yVar.mo23427a();
                    C17691e eVar3 = C17691e.UNKNOWN;
                    a3.copyOnWrite();
                    C17692f fVar7 = (C17692f) a3.instance;
                    C17692f fVar8 = C17692f.f50858f;
                    fVar7.f50862c = eVar3.f50857e;
                    fVar7.f50860a |= 4;
                    C17689c cVar4 = C17689c.DISCONNECTED;
                    a3.copyOnWrite();
                    C17692f fVar9 = (C17692f) a3.instance;
                    fVar9.f50861b = cVar4.f50850d;
                    fVar9.f50860a |= 1;
                    cxVar = C60856cj.m92900i(Optional.m71637of((C17692f) a3.build()));
                } else if ("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(action)) {
                    int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", LinearLayoutManager.INVALID_OFFSET);
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    C59052c cVar5 = (C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46961);
                    if (intExtra2 == 0) {
                        str = "STATE_DISCONNECTED";
                    } else if (intExtra2 == 1) {
                        str = "STATE_CONNECTING";
                    } else if (intExtra2 == 2) {
                        str = "STATE_CONNECTED";
                    } else if (intExtra2 == 3) {
                        str = "STATE_DISCONNECTING";
                    }
                    cVar5.mo56354G("Bluetooth adapter connection state to a profile changed. State:[%s] Device:[%s]", str, C17684y.m34956c(bluetoothDevice));
                    if (intExtra2 != 2) {
                        ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46963)).mo56386p("Adapter disconnected from all profiles.");
                        C17687a a4 = yVar.mo23427a();
                        C17691e eVar4 = C17691e.UNKNOWN;
                        a4.copyOnWrite();
                        C17692f fVar10 = (C17692f) a4.instance;
                        C17692f fVar11 = C17692f.f50858f;
                        fVar10.f50862c = eVar4.f50857e;
                        fVar10.f50860a |= 4;
                        C17689c cVar6 = C17689c.DISCONNECTED;
                        a4.copyOnWrite();
                        C17692f fVar12 = (C17692f) a4.instance;
                        fVar12.f50861b = cVar6.f50850d;
                        fVar12.f50860a |= 1;
                        cxVar = C60856cj.m92900i(Optional.m71637of((C17692f) a4.build()));
                    } else {
                        ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46962)).mo56386p("Adapter connected to some profile. Let's wait for the next intent which will be coming in.");
                        cxVar = C60856cj.m92900i(Optional.empty());
                    }
                } else if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
                    int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", LinearLayoutManager.INVALID_OFFSET);
                    ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46956)).mo56354G("A2DP profile connection state changed, State:[%s] Device:[%s]", C17684y.m34958e(intExtra3), C17684y.m34956c((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")));
                    if (intExtra3 != 2) {
                        boolean h = C17684y.m34960h();
                        boolean g = C17684y.m34959g();
                        ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46957)).mo56358K("A2DP device disconnected, profiles connected: headset:%b a2dp:%b", h, g);
                        if (h) {
                            ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46960)).mo56386p("A2DP device disconnected but still connected to headset profile");
                        } else {
                            C59104x b = C17684y.f50839a.mo56224b();
                            if (g) {
                                ((C59052c) ((C59052c) b).mo56372aa(46959)).mo56386p("A2DP device disconnected but still connected to the profile.");
                            } else {
                                ((C59052c) ((C59052c) b).mo56372aa(46958)).mo56386p("A2DP disconnected and headset profile disconnected");
                                C17687a a5 = yVar.mo23427a();
                                C17691e eVar5 = C17691e.UNKNOWN;
                                a5.copyOnWrite();
                                C17692f fVar13 = (C17692f) a5.instance;
                                C17692f fVar14 = C17692f.f50858f;
                                fVar13.f50862c = eVar5.f50857e;
                                fVar13.f50860a |= 4;
                                C17689c cVar7 = C17689c.DISCONNECTED;
                                a5.copyOnWrite();
                                C17692f fVar15 = (C17692f) a5.instance;
                                fVar15.f50861b = cVar7.f50850d;
                                fVar15.f50860a |= 1;
                                cxVar = C60856cj.m92900i(Optional.m71637of((C17692f) a5.build()));
                            }
                        }
                    }
                } else if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
                    int intExtra4 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", LinearLayoutManager.INVALID_OFFSET);
                    ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46951)).mo56354G("Headset profile connection state changed, State:[%s] Device:[%s]", C17684y.m34958e(intExtra4), C17684y.m34956c((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")));
                    if (intExtra4 != 2) {
                        boolean h2 = C17684y.m34960h();
                        boolean g2 = C17684y.m34959g();
                        ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46952)).mo56358K("Headset device disconnected, profiles connected: headset:%b a2dp:%b", h2, g2);
                        if (g2) {
                            ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46955)).mo56386p("Headset disconnected but still connected to A2DP profile");
                        } else if (h2) {
                            ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46954)).mo56386p("Headset device disconnected but still connected to the profile.");
                        } else {
                            ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46953)).mo56386p("Headset disconnected and A2DP profile disconnected");
                            C17687a a6 = yVar.mo23427a();
                            C17691e eVar6 = C17691e.UNKNOWN;
                            a6.copyOnWrite();
                            C17692f fVar16 = (C17692f) a6.instance;
                            C17692f fVar17 = C17692f.f50858f;
                            fVar16.f50862c = eVar6.f50857e;
                            fVar16.f50860a |= 4;
                            C17689c cVar8 = C17689c.DISCONNECTED;
                            a6.copyOnWrite();
                            C17692f fVar18 = (C17692f) a6.instance;
                            fVar18.f50861b = cVar8.f50850d;
                            fVar18.f50860a |= 1;
                            cxVar = C60856cj.m92900i(Optional.m71637of((C17692f) a6.build()));
                        }
                    }
                } else {
                    ((C59052c) ((C59052c) C17684y.f50839a.mo56226d()).mo56372aa(46950)).mo56389s("Unknown intent %s", action);
                    cxVar = C60856cj.m92900i(Optional.empty());
                }
            }
            cxVar = yVar.mo23428b();
        }
        C60856cj.m92911t(C47633f.m84733g(cxVar).mo51515h(new C17681v(yVar, intent), yVar.f50841c), C47810es.m84974n(new C17685z(this)), C60826bg.f164896a);
    }
}
