package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a.C106610h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a.C106615m;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106551f;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.q */
/* compiled from: PG */
final class C106543q extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C106544r f297096a;

    public C106543q(C106544r rVar) {
        this.f297096a = rVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C47538ax c = this.f297096a.f297103g.mo51613c("HeadsetStateTriggerSource#onReceive");
        try {
            String action = intent.getAction();
            if (action == null) {
                action = "empty";
            }
            ((C58970a) ((C58970a) this.f297096a.f297097a.mo56224b()).mo56372aa(23104)).mo56389s("HeadsetState: onReceive=%s", action);
            C106544r rVar = this.f297096a;
            C106551f fVar = rVar.f297107k;
            if (fVar == null) {
                ((C58970a) ((C58970a) rVar.f297097a.mo56224b()).mo56372aa(23105)).mo56386p("HeadsetState: No listener! bailing.");
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            }
            if (intent == null) {
                ((C58970a) ((C58970a) rVar.f297097a.mo56226d()).mo56372aa(23119)).mo56386p("HeadsetState: null intent");
                cxVar = C118826c.f331423b;
            } else {
                C106615m mVar = rVar.f297100d;
                String action2 = intent.getAction();
                if (mVar.mo95600k(intent)) {
                    C106527a a = mVar.mo95594a();
                    C106529c cVar = C106529c.CONNECTED;
                    a.copyOnWrite();
                    C106532f fVar2 = (C106532f) a.instance;
                    C106532f fVar3 = C106532f.f297078g;
                    fVar2.f297081b = cVar.f297070d;
                    fVar2.f297080a |= 1;
                    C106531e eVar = C106531e.WIRED;
                    a.copyOnWrite();
                    C106532f fVar4 = (C106532f) a.instance;
                    fVar4.f297082c = eVar.f297077e;
                    fVar4.f297080a |= 4;
                    cxVar2 = C60856cj.m92900i(Optional.m71637of((C106532f) a.build()));
                } else if (C106615m.m177384l(intent)) {
                    if (!C106615m.m177383h(mVar.f297253a)) {
                        ((C58970a) ((C58970a) mVar.f297255c.mo56226d()).mo56372aa(23148)).mo56386p("extractHeadsetState(): No permissions, wired headset disconnected.");
                        C106527a a2 = mVar.mo95594a();
                        C106531e eVar2 = C106531e.UNKNOWN;
                        a2.copyOnWrite();
                        C106532f fVar5 = (C106532f) a2.instance;
                        C106532f fVar6 = C106532f.f297078g;
                        fVar5.f297082c = eVar2.f297077e;
                        fVar5.f297080a |= 4;
                        C106529c cVar2 = C106529c.DISCONNECTED;
                        a2.copyOnWrite();
                        C106532f fVar7 = (C106532f) a2.instance;
                        fVar7.f297081b = cVar2.f297070d;
                        fVar7.f297080a |= 1;
                        cxVar2 = C60856cj.m92900i(Optional.m71637of((C106532f) a2.build()));
                    } else {
                        ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23147)).mo56386p("getBluetoothHeadsetState(): wired headset d/ced.");
                        cxVar2 = mVar.mo95595b();
                    }
                } else if (!C106615m.m177383h(mVar.f297253a)) {
                    ((C58970a) ((C58970a) mVar.f297255c.mo56226d()).mo56372aa(23146)).mo56386p("extractHeadsetState(): No permissions");
                    cxVar2 = C60856cj.m92900i(Optional.empty());
                } else {
                    String str = "ERROR";
                    if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action2)) {
                        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", LinearLayoutManager.INVALID_OFFSET);
                        C58970a aVar = (C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23145);
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
                        aVar.mo56389s("Bluetooth setting toggled. State:[%s]", str);
                        C106527a a3 = mVar.mo95594a();
                        C106531e eVar3 = C106531e.UNKNOWN;
                        a3.copyOnWrite();
                        C106532f fVar8 = (C106532f) a3.instance;
                        C106532f fVar9 = C106532f.f297078g;
                        fVar8.f297082c = eVar3.f297077e;
                        fVar8.f297080a |= 4;
                        C106529c cVar3 = C106529c.DISCONNECTED;
                        a3.copyOnWrite();
                        C106532f fVar10 = (C106532f) a3.instance;
                        fVar10.f297081b = cVar3.f297070d;
                        fVar10.f297080a |= 1;
                        cxVar2 = C60856cj.m92900i(Optional.m71637of((C106532f) a3.build()));
                    } else if ("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(action2)) {
                        int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", LinearLayoutManager.INVALID_OFFSET);
                        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        C58970a aVar2 = (C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23142);
                        if (intExtra2 == 0) {
                            str = "STATE_DISCONNECTED";
                        } else if (intExtra2 == 1) {
                            str = "STATE_CONNECTING";
                        } else if (intExtra2 == 2) {
                            str = "STATE_CONNECTED";
                        } else if (intExtra2 == 3) {
                            str = "STATE_DISCONNECTING";
                        }
                        aVar2.mo56354G("Bluetooth adapter connection state to a profile changed. State:[%s] Device:[%s]", str, C106615m.m177381e(bluetoothDevice));
                        if (intExtra2 != 2) {
                            ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23144)).mo56386p("Adapter disconnected from all profiles.");
                            C106527a a4 = mVar.mo95594a();
                            C106531e eVar4 = C106531e.UNKNOWN;
                            a4.copyOnWrite();
                            C106532f fVar11 = (C106532f) a4.instance;
                            C106532f fVar12 = C106532f.f297078g;
                            fVar11.f297082c = eVar4.f297077e;
                            fVar11.f297080a |= 4;
                            C106529c cVar4 = C106529c.DISCONNECTED;
                            a4.copyOnWrite();
                            C106532f fVar13 = (C106532f) a4.instance;
                            fVar13.f297081b = cVar4.f297070d;
                            fVar13.f297080a |= 1;
                            cxVar2 = C60856cj.m92900i(Optional.m71637of((C106532f) a4.build()));
                        } else {
                            ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23143)).mo56386p("Adapter connected to some profile. Let's wait for the next intent which will be coming in.");
                            cxVar2 = C60856cj.m92900i(Optional.empty());
                        }
                    } else if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(action2)) {
                        int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", LinearLayoutManager.INVALID_OFFSET);
                        BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23137)).mo56354G("A2DP profile connection state changed, State:[%s] Device:[%s]", C106615m.m177382g(intExtra3), C106615m.m177381e(bluetoothDevice2));
                        if (intExtra3 != 2) {
                            boolean j = mVar.mo95599j();
                            boolean i = mVar.mo95598i();
                            ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23138)).mo56358K("A2DP device disconnected, profiles connected: headset:%b a2dp:%b", j, i);
                            if (j) {
                                ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23141)).mo56386p("A2DP device disconnected but still connected to headset profile");
                                if (!mVar.f297256d.mo85405j(C90017bw.f247944bF)) {
                                    cxVar2 = C60856cj.m92900i(Optional.empty());
                                } else {
                                    cxVar2 = mVar.mo95595b();
                                }
                            } else if (i) {
                                ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23140)).mo56386p("A2DP device disconnected but still connected to the profile.");
                                if (!mVar.f297256d.mo85405j(C90017bw.f247944bF)) {
                                    cxVar2 = C60856cj.m92900i(Optional.empty());
                                } else {
                                    cxVar2 = mVar.mo95595b();
                                }
                            } else {
                                ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23139)).mo56386p("A2DP disconnected and headset profile disconnected");
                                C106527a a5 = mVar.mo95594a();
                                C106531e eVar5 = C106531e.UNKNOWN;
                                a5.copyOnWrite();
                                C106532f fVar14 = (C106532f) a5.instance;
                                C106532f fVar15 = C106532f.f297078g;
                                fVar14.f297082c = eVar5.f297077e;
                                fVar14.f297080a |= 4;
                                C106529c cVar5 = C106529c.DISCONNECTED;
                                a5.copyOnWrite();
                                C106532f fVar16 = (C106532f) a5.instance;
                                fVar16.f297081b = cVar5.f297070d;
                                fVar16.f297080a |= 1;
                                cxVar2 = C60856cj.m92900i(Optional.m71637of((C106532f) a5.build()));
                            }
                        } else if (!mVar.f297256d.mo85405j(C90017bw.f247944bF)) {
                            cxVar2 = C60856cj.m92900i(mVar.mo95596c(bluetoothDevice2));
                        } else {
                            cxVar2 = mVar.mo95595b();
                        }
                    } else if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action2)) {
                        int intExtra4 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", LinearLayoutManager.INVALID_OFFSET);
                        BluetoothDevice bluetoothDevice3 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23132)).mo56354G("Headset profile connection state changed, State:[%s] Device:[%s]", C106615m.m177382g(intExtra4), C106615m.m177381e(bluetoothDevice3));
                        if (intExtra4 != 2) {
                            boolean j2 = mVar.mo95599j();
                            boolean i2 = mVar.mo95598i();
                            ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23133)).mo56358K("Headset device disconnected, profiles connected: headset:%b a2dp:%b", j2, i2);
                            if (i2) {
                                ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23136)).mo56386p("Headset disconnected but still connected to A2DP profile");
                                if (!mVar.f297256d.mo85405j(C90017bw.f247944bF)) {
                                    cxVar2 = C60856cj.m92900i(Optional.empty());
                                } else {
                                    cxVar2 = mVar.mo95595b();
                                }
                            } else if (j2) {
                                ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23135)).mo56386p("Headset device disconnected but still connected to the profile.");
                                if (!mVar.f297256d.mo85405j(C90017bw.f247944bF)) {
                                    cxVar2 = C60856cj.m92900i(Optional.empty());
                                } else {
                                    cxVar2 = mVar.mo95595b();
                                }
                            } else {
                                ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23134)).mo56386p("Headset disconnected and A2DP profile disconnected");
                                C106527a a6 = mVar.mo95594a();
                                C106531e eVar6 = C106531e.UNKNOWN;
                                a6.copyOnWrite();
                                C106532f fVar17 = (C106532f) a6.instance;
                                C106532f fVar18 = C106532f.f297078g;
                                fVar17.f297082c = eVar6.f297077e;
                                fVar17.f297080a |= 4;
                                C106529c cVar6 = C106529c.DISCONNECTED;
                                a6.copyOnWrite();
                                C106532f fVar19 = (C106532f) a6.instance;
                                fVar19.f297081b = cVar6.f297070d;
                                fVar19.f297080a |= 1;
                                cxVar2 = C60856cj.m92900i(Optional.m71637of((C106532f) a6.build()));
                            }
                        } else if (!mVar.f297256d.mo85405j(C90017bw.f247944bF)) {
                            cxVar2 = C60856cj.m92900i(mVar.mo95596c(bluetoothDevice3));
                        } else {
                            cxVar2 = mVar.mo95595b();
                        }
                    } else {
                        ((C58970a) ((C58970a) mVar.f297255c.mo56226d()).mo56372aa(23131)).mo56389s("Unknown intent %s", action2);
                        cxVar2 = C60856cj.m92900i(Optional.empty());
                    }
                }
                cxVar = rVar.f297104h.mo57305b(new C106538l(rVar, C47633f.m84733g(cxVar2).mo51515h(new C106610h(mVar, intent), mVar.f297257e), fVar), rVar.f297102f);
            }
            C46459k.m82829b(cxVar, "onReceive=%s failed", action);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
