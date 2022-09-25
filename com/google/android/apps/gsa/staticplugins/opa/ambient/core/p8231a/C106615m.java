package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import androidx.core.content.C1882h;
import androidx.core.p094f.C1888a;
import androidx.p104d.p105a.C2169h;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.C73801ae;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.shared.util.permissions.C91076c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106527a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106529c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4537i.C59294s;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.a.m */
/* compiled from: PG */
public final class C106615m {

    /* renamed from: a */
    public final Context f297253a;

    /* renamed from: b */
    public final AudioManager f297254b;

    /* renamed from: c */
    public final C58974d f297255c;

    /* renamed from: d */
    public final C91142g f297256d;

    /* renamed from: e */
    public final C60888db f297257e;

    /* renamed from: f */
    private final C21370a f297258f;

    public C106615m(Context context, AudioManager audioManager, C91142g gVar, C21370a aVar, C60888db dbVar, C83564a aVar2) {
        this.f297253a = context;
        this.f297254b = audioManager;
        this.f297256d = gVar;
        this.f297258f = aVar;
        this.f297257e = dbVar;
        this.f297255c = aVar2.mo76900a("headsetCtxPrv");
    }

    /* renamed from: d */
    public static Optional m177380d(List list, boolean z) {
        return Collection.EL.stream(list).filter(new C106607e(z)).findFirst();
    }

    /* renamed from: e */
    public static String m177381e(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return "no device";
        }
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        Locale locale = Locale.US;
        Object[] objArr = new Object[15];
        boolean z = false;
        objArr[0] = bluetoothDevice.getName();
        objArr[1] = Integer.valueOf(bluetoothDevice.getType());
        objArr[2] = bluetoothDevice.getAddress();
        objArr[3] = bluetoothClass;
        int i = -1;
        objArr[4] = Integer.valueOf(bluetoothClass != null ? bluetoothClass.getDeviceClass() : -1);
        if (bluetoothClass != null) {
            i = bluetoothClass.getMajorDeviceClass();
        }
        objArr[5] = Integer.valueOf(i);
        objArr[6] = Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(8192) : false);
        objArr[7] = Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(65536) : false);
        objArr[8] = Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(C89885b.S3REQUEST_VALUE) : false);
        objArr[9] = Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(C89885b.HTTP_VALUE) : false);
        objArr[10] = Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(524288) : false);
        objArr[11] = Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(1048576) : false);
        objArr[12] = Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(C89885b.NOW_VALUE) : false);
        objArr[13] = Boolean.valueOf(bluetoothClass != null ? bluetoothClass.hasService(4194304) : false);
        if (bluetoothClass != null) {
            z = bluetoothClass.hasService(8388608);
        }
        objArr[14] = Boolean.valueOf(z);
        return String.format(locale, "name:%s type:%d addr:%s class:%s deviceClass:%d majorDeviceClass:%d services{limited_disc:%b pos:%b netwrk:%b render:%b capture:%b obj_tfr:%b audio:%b tele:%b info:%b}", objArr);
    }

    /* renamed from: g */
    public static String m177382g(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "ERROR" : "STATE_DISCONNECTING" : "STATE_CONNECTED" : "STATE_CONNECTING" : "STATE_DISCONNECTED";
    }

    /* renamed from: h */
    public static boolean m177383h(Context context) {
        if (C1888a.m5149c() || Build.VERSION.SDK_INT > 30) {
            return C91076c.m148792a(context);
        }
        return C1882h.m5137c(context, "android.permission.BLUETOOTH") == 0;
    }

    /* renamed from: l */
    public static boolean m177384l(Intent intent) {
        if (!"android.intent.action.HEADSET_PLUG".equals(intent.getAction()) || intent.getIntExtra("state", 0) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private final C60870cx m177385m(Context context, int i) {
        if (!m177383h(context)) {
            ((C58970a) ((C58970a) this.f297255c.mo56226d()).mo56372aa(23150)).mo56386p("Bluetooth permissions not granted, returning an empty list");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        return C47633f.m84733g(C2169h.m6027a(new C106603a(this, context, i))).mo51517j(5, TimeUnit.SECONDS, this.f297257e).mo51513e(TimeoutException.class, new C106604b(this), this.f297257e);
    }

    /* renamed from: a */
    public final C106527a mo95594a() {
        C106527a aVar = (C106527a) C106532f.f297078g.createBuilder();
        long c = this.f297258f.mo26871c();
        aVar.copyOnWrite();
        C106532f fVar = (C106532f) aVar.instance;
        fVar.f297080a |= 16;
        fVar.f297084e = c;
        return aVar;
    }

    /* renamed from: b */
    public final C60870cx mo95595b() {
        ((C58970a) ((C58970a) this.f297255c.mo56224b()).mo56372aa(23149)).mo56358K("getBluetoothHeadsetState(): profiles connected: headset:%b a2dp:%b", mo95599j(), mo95598i());
        ArrayList arrayList = new ArrayList();
        if (this.f297256d.mo85405j(C90017bw.f247922ak)) {
            arrayList.add(m177385m(this.f297253a, 1));
        }
        arrayList.add(m177385m(this.f297253a, 2));
        C60870cx o = C60856cj.m92906o(arrayList);
        C106612j jVar = new C106612j(this);
        return C60922j.m93044g(o, C47810es.m84963c(jVar), this.f297257e);
    }

    /* renamed from: c */
    public final Optional mo95596c(BluetoothDevice bluetoothDevice) {
        C106531e eVar;
        if (bluetoothDevice == null) {
            ((C58970a) ((C58970a) this.f297255c.mo56226d()).mo56372aa(23152)).mo56386p("No device in intent");
            return Optional.empty();
        }
        C106527a a = mo95594a();
        C106529c cVar = C106529c.CONNECTED;
        a.copyOnWrite();
        C106532f fVar = (C106532f) a.instance;
        C106532f fVar2 = C106532f.f297078g;
        fVar.f297081b = cVar.f297070d;
        fVar.f297080a |= 1;
        if (C73801ae.m108365a(bluetoothDevice)) {
            eVar = C106531e.CAR_BLUETOOTH;
        } else {
            eVar = C106531e.GENERIC_BLUETOOTH;
        }
        a.copyOnWrite();
        C106532f fVar3 = (C106532f) a.instance;
        fVar3.f297082c = eVar.f297077e;
        fVar3.f297080a |= 4;
        String name = bluetoothDevice.getName();
        a.copyOnWrite();
        C106532f fVar4 = (C106532f) a.instance;
        name.getClass();
        fVar4.f297080a |= 8;
        fVar4.f297083d = name;
        String f = mo95597f(Optional.m71637of(bluetoothDevice));
        a.copyOnWrite();
        C106532f fVar5 = (C106532f) a.instance;
        fVar5.f297080a |= 32;
        fVar5.f297085f = f;
        return Optional.m71637of((C106532f) a.build());
    }

    /* renamed from: f */
    public final String mo95597f(Optional optional) {
        if (!this.f297256d.mo85405j(C90017bw.f247908aW) || !optional.isPresent()) {
            return BuildConfig.FLAVOR;
        }
        String str = (String) optional.map(C106605c.f297238a).orElse(BuildConfig.FLAVOR);
        String str2 = (String) optional.map(C106606d.f297239a).orElse(BuildConfig.FLAVOR);
        if (str.isEmpty() && str2.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        return C59294s.m92135e().mo56760b(str.concat(str2)).toString();
    }

    /* renamed from: i */
    public final boolean mo95598i() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        boolean z = false;
        if (defaultAdapter != null && defaultAdapter.getProfileConnectionState(2) == 2) {
            z = true;
        }
        ((C58970a) ((C58970a) this.f297255c.mo56224b()).mo56372aa(23163)).mo56389s("is a2dp profile connected? %s", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: j */
    public final boolean mo95599j() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        boolean z = false;
        if (defaultAdapter != null && defaultAdapter.getProfileConnectionState(1) == 2) {
            z = true;
        }
        ((C58970a) ((C58970a) this.f297255c.mo56224b()).mo56372aa(23164)).mo56358K("is headset profile connected? %s check_enabled? %b", z, this.f297256d.mo85405j(C90017bw.f247922ak));
        return z;
    }

    /* renamed from: k */
    public final boolean mo95600k(Intent intent) {
        boolean z = true;
        if (intent != null && "android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
            if (intent.getIntExtra("state", 0) <= 0) {
                z = false;
            }
            ((C58970a) ((C58970a) this.f297255c.mo56224b()).mo56372aa(23170)).mo56389s("headset plug, got intent w/ extra: %s", Boolean.valueOf(z));
            return z;
        } else if (this.f297254b.isWiredHeadsetOn()) {
            return true;
        } else {
            for (AudioDeviceInfo type : this.f297254b.getDevices(3)) {
                if (C58528ij.m90012L(4, 3, 22).contains(Integer.valueOf(type.getType()))) {
                    ((C58970a) ((C58970a) this.f297255c.mo56224b()).mo56372aa(23169)).mo56386p("got wired device, returning true");
                    return true;
                }
            }
            ((C58970a) ((C58970a) this.f297255c.mo56224b()).mo56372aa(23168)).mo56386p("wired -- returning false");
            return false;
        }
    }
}
