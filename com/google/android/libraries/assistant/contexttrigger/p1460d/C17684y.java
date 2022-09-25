package com.google.android.libraries.assistant.contexttrigger.p1460d;

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
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17687a;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
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

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.y */
/* compiled from: PG */
public final class C17684y {

    /* renamed from: a */
    public static final C59071e f50839a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.d.y");

    /* renamed from: b */
    public final Context f50840b;

    /* renamed from: c */
    public final C60888db f50841c;

    /* renamed from: d */
    private final AudioManager f50842d;

    /* renamed from: e */
    private final C21370a f50843e;

    public C17684y(Context context, AudioManager audioManager, C21370a aVar, C60888db dbVar) {
        this.f50840b = context;
        this.f50842d = audioManager;
        this.f50843e = aVar;
        this.f50841c = dbVar;
    }

    /* renamed from: c */
    public static String m34956c(BluetoothDevice bluetoothDevice) {
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

    /* renamed from: d */
    public static String m34957d(List list, boolean z) {
        if (list == null || list.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        return (String) Collection.EL.stream(list).filter(new C17674o(z)).findFirst().map(C17675p.f50825a).orElse(BuildConfig.FLAVOR);
    }

    /* renamed from: e */
    public static String m34958e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "ERROR" : "STATE_DISCONNECTING" : "STATE_CONNECTED" : "STATE_CONNECTING" : "STATE_DISCONNECTED";
    }

    /* renamed from: g */
    public static boolean m34959g() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        boolean z = false;
        if (defaultAdapter != null && defaultAdapter.getProfileConnectionState(2) == 2) {
            z = true;
        }
        ((C59052c) ((C59052c) f50839a.mo56224b()).mo56372aa(46977)).mo56389s("is a2dp profile connected? %s", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: h */
    public static boolean m34960h() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || defaultAdapter.getProfileConnectionState(1) != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m34961j(Intent intent) {
        if (!"android.intent.action.HEADSET_PLUG".equals(intent.getAction()) || intent.getIntExtra("state", 0) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C17687a mo23427a() {
        C17687a aVar = (C17687a) C17692f.f50858f.createBuilder();
        long c = this.f50843e.mo26871c();
        aVar.copyOnWrite();
        C17692f fVar = (C17692f) aVar.instance;
        fVar.f50860a |= 16;
        fVar.f50864e = c;
        return aVar;
    }

    /* renamed from: b */
    public final C60870cx mo23428b() {
        Object obj;
        boolean h = m34960h();
        boolean g = m34959g();
        C59071e eVar = f50839a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(46968)).mo56358K("getBluetoothHeadsetState(): profiles connected: headset:%b a2dp:%b", h, g);
        ArrayList arrayList = new ArrayList();
        Context context = this.f50840b;
        if (!mo23429f(context)) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(46969)).mo56386p("Bluetooth permissions not granted, returning an empty list");
            obj = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            obj = C47633f.m84733g(C2169h.m6027a(new C17677r(context))).mo51517j(5, TimeUnit.SECONDS, this.f50841c).mo51513e(TimeoutException.class, C17678s.f50828a, this.f50841c);
        }
        arrayList.add(obj);
        C60870cx o = C60856cj.m92906o(arrayList);
        C17673n nVar = new C17673n(this);
        return C60922j.m93044g(o, C47810es.m84963c(nVar), this.f50841c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo23429f(Context context) {
        if (!C1888a.m5149c() && Build.VERSION.SDK_INT <= 30) {
            return true;
        }
        if (C1882h.m5137c(context.getApplicationContext(), "android.permission.BLUETOOTH_SCAN") == 0 && C1882h.m5137c(context.getApplicationContext(), "android.permission.BLUETOOTH_CONNECT") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo23430i(Intent intent) {
        boolean z = true;
        if (intent != null && "android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
            if (intent.getIntExtra("state", 0) <= 0) {
                z = false;
            }
            ((C59052c) ((C59052c) f50839a.mo56224b()).mo56372aa(46983)).mo56389s("headset plug, got intent w/ extra: %s", Boolean.valueOf(z));
            return z;
        } else if (this.f50842d.isWiredHeadsetOn()) {
            return true;
        } else {
            for (AudioDeviceInfo type : this.f50842d.getDevices(3)) {
                if (C58528ij.m90012L(4, 3, 22).contains(Integer.valueOf(type.getType()))) {
                    ((C59052c) ((C59052c) f50839a.mo56224b()).mo56372aa(46982)).mo56386p("got wired device, returning true");
                    return true;
                }
            }
            ((C59052c) ((C59052c) f50839a.mo56224b()).mo56372aa(46981)).mo56386p("wired -- returning false");
            return false;
        }
    }
}
