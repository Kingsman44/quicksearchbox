package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.SparseArray;
import android.widget.Button;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.bisto.C89646bc;
import com.google.android.apps.gsa.shared.bisto.C89681t;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gq */
/* compiled from: PG */
public final class C96248gq extends C96098bb implements C89495cg {

    /* renamed from: B */
    private static final int f269385B = ((int) TimeUnit.SECONDS.toMillis(2));

    /* renamed from: C */
    private static final long f269386C = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: m */
    public static final C59071e f269387m = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gq");

    /* renamed from: n */
    static final long f269388n = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: o */
    static final long f269389o = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: p */
    static final long f269390p = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: q */
    static final long f269391q = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: r */
    static final Set f269392r = new HashSet(Arrays.asList(new Integer[]{2, 1}));

    /* renamed from: A */
    public int f269393A = 0;

    /* renamed from: E */
    private C89646bc f269394E;

    /* renamed from: F */
    private C60870cx f269395F;

    /* renamed from: G */
    private ProgressBar f269396G;

    /* renamed from: H */
    private BroadcastReceiver f269397H = null;

    /* renamed from: s */
    public C22871g f269398s;

    /* renamed from: t */
    public C89492cd f269399t;

    /* renamed from: u */
    public C96094ay f269400u;

    /* renamed from: v */
    boolean f269401v;

    /* renamed from: w */
    int f269402w = 0;

    /* renamed from: x */
    public final SparseArray f269403x = new SparseArray();

    /* renamed from: y */
    public C60870cx f269404y;

    /* renamed from: z */
    public C60870cx f269405z;

    /* renamed from: p */
    public static void m159545p(int i, int i2) {
        C59104x c = f269387m.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
        ((C59052c) ((C59052c) c).mo56372aa(17023)).mo56393w("Expected in state %d, but in actual state %d", i, i2);
    }

    /* renamed from: t */
    public static boolean m159546t(int i) {
        return i == 12 || i == 14 || i == 13;
    }

    /* renamed from: u */
    static final boolean m159547u(BluetoothDevice bluetoothDevice) {
        try {
            if (Boolean.TRUE.equals(BluetoothDevice.class.getMethod("isConnected", new Class[0]).invoke(bluetoothDevice, new Object[0]))) {
                C59104x b = f269387m.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
                ((C59052c) ((C59052c) b).mo56372aa(17034)).mo56386p("Still connected");
                return true;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            C59104x d = f269387m.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(17035)).mo56386p("Can't check if connected");
        }
        return false;
    }

    /* renamed from: v */
    private final synchronized void m159548v() {
        C60870cx cxVar = this.f269404y;
        if (cxVar != null && !cxVar.isDone()) {
            this.f269404y.cancel(false);
        }
        this.f269404y = null;
    }

    /* renamed from: w */
    private final synchronized void m159549w() {
        C60870cx cxVar = this.f269405z;
        if (cxVar != null && !cxVar.isDone()) {
            this.f269405z.cancel(false);
        }
        this.f269405z = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "HerbieAuxLoading";
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (set.contains(25)) {
            C59071e eVar = f269387m;
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
            ((C59052c) ((C59052c) b).mo56372aa(17029)).mo56386p("onDeviceInfoChanged");
            if (this.f269402w == 7) {
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
                ((C59052c) ((C59052c) b2).mo56372aa(17030)).mo56389s("is In Pairing mode : %b", Boolean.valueOf(dVar.mo106493ag()));
                mo90021q(true != dVar.mo106493ag() ? 5 : 8);
            }
        }
    }

    /* renamed from: g */
    public final void mo89941g(OpaPageLayout opaPageLayout) {
        C96095az azVar;
        C59071e eVar = f269387m;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
        ((C59052c) ((C59052c) b).mo56372aa(17011)).mo56386p("customizeView");
        super.mo89941g(opaPageLayout);
        Button button = this.f269033g;
        button.getClass();
        button.setText(R.string.bisto_try_again);
        Button button2 = this.f269033g;
        button2.getClass();
        button2.setVisibility(8);
        Button button3 = this.f269034h;
        button3.getClass();
        button3.setVisibility(8);
        Button button4 = this.f269033g;
        button4.getClass();
        button4.setOnClickListener(new C89943l(new C96237gf(this)));
        this.f269401v = "samsung".equals(Build.BRAND);
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
        ((C59052c) ((C59052c) b2).mo56372aa(17012)).mo56389s("shouldUseRepairFlow %b", Boolean.valueOf(this.f269401v));
        ProgressBar progressBar = (ProgressBar) opaPageLayout.findViewById(R.id.loading_progress_bar);
        this.f269396G = progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.f269394E = new C89646bc(f269385B, 3, f269386C, 0);
        C96245gn gnVar = new C96245gn(this);
        for (Integer intValue : f269392r) {
            int intValue2 = intValue.intValue();
            if (this.f269403x.get(intValue2) == null) {
                BluetoothAdapter.getDefaultAdapter().getProfileProxy(getContext(), gnVar, intValue2);
            }
        }
        String str = this.f269400u.f269039a;
        if (!(str == null || (azVar = this.f269050l) == null)) {
            String name = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str).getName();
            String str2 = azVar.f269040a;
            if (str2 != null) {
                mo89946l(String.format(str2, new Object[]{name}));
            }
        }
        if (this.f269403x.size() == f269392r.size()) {
            C59104x b3 = f269387m.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
            ((C59052c) ((C59052c) b3).mo56372aa(17014)).mo56387q("customizeView move to state =%d", this.f269402w);
            mo90021q(this.f269402w);
        } else {
            C59104x c = f269387m.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
            ((C59052c) ((C59052c) c).mo56372aa(17013)).mo56386p("missing some profile proxy");
        }
        this.f269399t.mo83360B(new C58759qy(25), this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.UUID");
        if (this.f269397H == null) {
            this.f269397H = new C96247gp(this);
            getContext().registerReceiver(this.f269397H, intentFilter);
        }
        this.f269394E.mo83535b();
    }

    /* renamed from: o */
    public final synchronized void mo90018o() {
        String str = this.f269400u.f269039a;
        if (str == null) {
            C59104x c = f269387m.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
            ((C59052c) ((C59052c) c).mo56372aa(17017)).mo56386p("deviceId null");
            return;
        }
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
        if (this.f269394E.mo83536c()) {
            C59104x c2 = f269387m.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
            ((C59052c) ((C59052c) c2).mo56372aa(17016)).mo56386p("retry limit exceeded");
            if (!m159546t(this.f269402w)) {
                mo90021q(13);
                return;
            }
            return;
        }
        C60870cx cxVar = this.f269405z;
        if (cxVar != null && !cxVar.isDone()) {
            this.f269405z.cancel(false);
        }
        this.f269405z = this.f269398s.mo28208h("fetchUuidsWithSdp", this.f269394E.mo83534a(), new C96244gm(this, remoteDevice));
    }

    public final void onDestroy() {
        super.onDestroy();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        for (int i = 0; i < this.f269403x.size(); i++) {
            defaultAdapter.closeProfileProxy(this.f269403x.keyAt(i), (BluetoothProfile) this.f269403x.valueAt(i));
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        mo90023s();
        BroadcastReceiver broadcastReceiver = this.f269397H;
        if (broadcastReceiver != null) {
            try {
                getContext().unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                C59104x d = f269387m.mo56226d();
                d.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(17032)).mo56386p("bluetoothStatusReceiver receiver not registered.");
            }
            this.f269397H = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo90021q(int i) {
        Method method;
        C59071e eVar = f269387m;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
        ((C59052c) ((C59052c) b).mo56372aa(17024)).mo56393w("move from state %d to =%d", this.f269402w, i);
        String str = this.f269400u.f269039a;
        if (str == null) {
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
            ((C59052c) ((C59052c) c).mo56372aa(17028)).mo56386p("No bluetooth device defined");
            return;
        }
        this.f269402w = i;
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
        switch (i) {
            case 0:
                ProgressBar progressBar = this.f269396G;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
                Button button = this.f269033g;
                button.getClass();
                button.setVisibility(8);
                this.f269394E.mo83535b();
                this.f269393A = 0;
                synchronized (this) {
                    C60870cx cxVar = this.f269395F;
                    if (cxVar != null && !cxVar.isDone()) {
                        this.f269395F.cancel(false);
                    }
                    this.f269395F = this.f269398s.mo28208h("globalTimeOut", f269391q, new C96239gh(this, i));
                }
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
                ((C59052c) ((C59052c) b2).mo56372aa(17026)).mo56387q("device.getBondState() : %d", remoteDevice.getBondState());
                if (this.f269401v && remoteDevice.getBondState() != 12) {
                    C59104x b3 = eVar.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
                    ((C59052c) ((C59052c) b3).mo56372aa(17027)).mo56387q("device.getBondState() : %d", remoteDevice.getBondState());
                    mo90021q(9);
                    return;
                } else if (C89681t.m146047m(remoteDevice.getUuids())) {
                    mo90021q(2);
                    return;
                } else if (!m159547u(remoteDevice)) {
                    mo90021q(1);
                    return;
                } else {
                    mo90021q(3);
                    return;
                }
            case 1:
            case 2:
            case 5:
                mo90018o();
                return;
            case 3:
                C59104x b4 = eVar.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
                ((C59052c) ((C59052c) b4).mo56372aa(17036)).mo56386p("sendEnableAudioOutputSignal");
                Intent intent = new Intent("bisto_enable_audio_output");
                intent.putExtra("extra_enable_state", true);
                intent.putExtra("key_device_id", this.f269400u.f269039a);
                mo90021q(true != C124519a.m203974a(getContext(), intent) ? 14 : 4);
                return;
            case 4:
            case 7:
                return;
            case 6:
                this.f269398s.mo28213m("enterpairingmode", f269389o, new C96240gi(this, remoteDevice));
                return;
            case 8:
                this.f269398s.mo28213m("removeBond", f269388n, new C96241gj(this, remoteDevice));
                return;
            case 9:
                this.f269398s.mo28213m("createBond", f269388n, new C96242gk(this, remoteDevice, i));
                return;
            case 11:
                if (this.f269400u.f269039a != null) {
                    BluetoothDevice remoteDevice2 = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.f269400u.f269039a);
                    Iterator it = f269392r.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            BluetoothProfile bluetoothProfile = (BluetoothProfile) this.f269403x.get(intValue);
                            if (bluetoothProfile == null) {
                                C59104x c2 = f269387m.mo56225c();
                                c2.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
                                ((C59052c) ((C59052c) c2).mo56372aa(17010)).mo56387q("missing proxy for profile %d", intValue);
                            } else if (bluetoothProfile.getConnectionState(remoteDevice2) != 2) {
                                if (intValue == 1) {
                                    method = BluetoothHeadset.class.getMethod("connect", new Class[]{BluetoothDevice.class});
                                } else if (intValue != 2) {
                                    try {
                                        C59104x c3 = f269387m.mo56225c();
                                        c3.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
                                        ((C59052c) ((C59052c) c3).mo56372aa(17008)).mo56386p("Unknown profile");
                                        method = null;
                                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                                        C59104x c4 = f269387m.mo56225c();
                                        c4.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
                                        ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e)).mo56372aa(17009)).mo56387q("Failed to connect to profile %d", intValue);
                                    }
                                } else {
                                    method = BluetoothA2dp.class.getMethod("connect", new Class[]{BluetoothDevice.class});
                                }
                                if (method != null) {
                                    method.invoke(bluetoothProfile, new Object[]{remoteDevice2});
                                }
                            }
                        }
                    }
                    mo90022r();
                    return;
                }
                C59104x c5 = eVar.mo56225c();
                c5.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
                ((C59052c) ((C59052c) c5).mo56372aa(17015)).mo56386p("deviceId null");
                return;
            case 12:
                mo77318iT().mo77312a();
                return;
            case 13:
            case 14:
                mo90023s();
                ProgressBar progressBar2 = this.f269396G;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                }
                Button button2 = this.f269033g;
                button2.getClass();
                button2.setVisibility(0);
                return;
            default:
                C59104x c6 = eVar.mo56225c();
                c6.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
                ((C59052c) ((C59052c) c6).mo56372aa(17025)).mo56386p("Unknown state");
                return;
        }
    }

    /* renamed from: r */
    public final synchronized void mo90022r() {
        C60870cx cxVar = this.f269404y;
        if (cxVar != null && !cxVar.isDone()) {
            this.f269404y.cancel(false);
        }
        C59104x b = f269387m.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
        long j = f269388n;
        ((C59052c) ((C59052c) b).mo56372aa(17031)).mo56388r("Scheduling next status check %d msec.", j);
        this.f269404y = this.f269398s.mo28208h("AudioStatusCheck", j, new C96238gg(this));
    }

    /* renamed from: s */
    public final synchronized void mo90023s() {
        m159549w();
        m159548v();
    }
}
