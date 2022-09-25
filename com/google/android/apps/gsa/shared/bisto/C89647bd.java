package com.google.android.apps.gsa.shared.bisto;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124527h;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.bisto.bd */
/* compiled from: PG */
public final class C89647bd {

    /* renamed from: a */
    private final Context f242750a;

    /* renamed from: b */
    private final C68214a f242751b;

    public C89647bd(Context context, C68214a aVar) {
        this.f242750a = context;
        this.f242751b = aVar;
    }

    /* renamed from: d */
    private static StringBuilder m145933d(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append(',');
        sb.append(str);
        sb.append(',');
        return sb;
    }

    /* renamed from: a */
    public final C58485gu mo83537a() {
        C58480gp e = C58485gu.m89837e();
        if (!C124527h.m203996b(this.f242750a)) {
            C58976aa aaVar = C58975e.f156826a;
            return e.mo55394f();
        } else if (!C124527h.m203995a(this.f242750a)) {
            C58976aa aaVar2 = C58975e.f156826a;
            return e.mo55394f();
        } else {
            UsbManager usbManager = (UsbManager) this.f242750a.getSystemService("usb");
            if (usbManager != null) {
                HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
                if (deviceList == null) {
                    return e.mo55394f();
                }
                for (UsbDevice next : deviceList.values()) {
                    if (mo83539c(next)) {
                        e.mo55395g(next);
                    }
                }
            }
            return e.mo55394f();
        }
    }

    /* renamed from: b */
    public final boolean mo83538b() {
        if (!C124527h.m203996b(this.f242750a)) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        AudioManager audioManager = (AudioManager) this.f242750a.getSystemService("audio");
        if (audioManager == null) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        }
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        C58976aa aaVar3 = C58975e.f156826a;
        for (AudioDeviceInfo type : devices) {
            int type2 = type.getType();
            if (type2 == 4 || type2 == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo83539c(UsbDevice usbDevice) {
        String g = ((C91142g) this.f242751b.mo27525b()).mo85402g("GsaPrefs.Bisto__whitelisted_usb_devices", BuildConfig.FLAVOR);
        String format = String.format(Locale.getDefault(), "%x-%x", new Object[]{Integer.valueOf(usbDevice.getVendorId()), Integer.valueOf(usbDevice.getProductId())});
        C58976aa aaVar = C58975e.f156826a;
        if (m145933d(g).indexOf(m145933d(format).toString()) < 0 || usbDevice.getSerialNumber() == null) {
            return false;
        }
        return true;
    }
}
