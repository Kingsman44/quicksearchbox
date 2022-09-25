package com.google.android.apps.gsa.shared.bisto;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.usb.UsbDevice;
import android.os.Build;
import android.os.ParcelUuid;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.permissions.C91076c;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.bisto.t */
/* compiled from: PG */
public final class C89681t {

    /* renamed from: a */
    public static final C59071e f242809a = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.t");

    /* renamed from: b */
    public static final UUID f242810b = UUID.fromString("df21fe2c-2515-4fdb-8886-f12c4d67927c");

    /* renamed from: c */
    private static final long f242811c = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: d */
    private static final long f242812d = TimeUnit.HOURS.toMillis(1);

    /* renamed from: a */
    public static Collection m146035a(Context context) {
        HashSet hashSet = new HashSet();
        if (!m146056v()) {
            return hashSet;
        }
        C89652g a = C89652g.m145951a();
        if (C91076c.m148792a(context)) {
            Set<C124539a> b = a.mo83541b();
            if (b != null) {
                for (C124539a aVar : b) {
                    if (m146052r(aVar, false, (SharedPreferences) null) && aVar.mo106454c()) {
                        hashSet.add(aVar);
                    }
                }
            } else {
                C59104x c = f242809a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "DeviceDetector");
                ((C59052c) ((C59052c) c).mo56372aa(10223)).mo56386p("Unable to get connected devices: null bluetooth devices");
            }
        } else {
            C59104x c2 = f242809a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "DeviceDetector");
            ((C59052c) ((C59052c) c2).mo56372aa(10222)).mo56386p("Unable to get connected devices: null bluetooth adapter");
        }
        return hashSet;
    }

    /* renamed from: b */
    public static Set m146036b(SharedPreferences sharedPreferences) {
        C89680s sVar;
        Set<String> stringSet = sharedPreferences.getStringSet("prefs.known_bisto_devices", new HashSet());
        HashSet hashSet = new HashSet(stringSet.size());
        for (String next : stringSet) {
            if (next.contains("_")) {
                String[] split = next.split("_");
                sVar = null;
                if (split != null && split.length >= 2) {
                    sVar = new C89680s(split[0]);
                }
            } else {
                sVar = new C89680s(next);
            }
            if (sVar != null) {
                C58976aa aaVar = C58975e.f156826a;
                hashSet.add(sVar);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public static Set m146037c(Context context, SharedPreferences sharedPreferences, boolean z) {
        Set b = m146036b(sharedPreferences);
        HashSet hashSet = new HashSet(b);
        C89652g a = C89652g.m145951a();
        if (C91076c.m148792a(context)) {
            Set<C124539a> b2 = a.mo83541b();
            if (b2 == null || (b2.isEmpty() && !m146056v())) {
                C58976aa aaVar = C58975e.f156826a;
            } else {
                for (C124539a aVar : b2) {
                    if (m146052r(aVar, z, sharedPreferences)) {
                        C58976aa aaVar2 = C58975e.f156826a;
                        hashSet.add(new C89680s(aVar.f343619a.getAddress()));
                    }
                }
                if (!b.equals(hashSet)) {
                    m146040f(hashSet, sharedPreferences);
                }
            }
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
        }
        return hashSet;
    }

    /* renamed from: d */
    public static void m146038d(SharedPreferences sharedPreferences) {
        Set b = m146036b(sharedPreferences);
        if (b.add(new C89680s("wired"))) {
            m146040f(b, sharedPreferences);
        }
    }

    /* renamed from: e */
    public static void m146039e(String str, SharedPreferences sharedPreferences) {
        C58976aa aaVar = C58975e.f156826a;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove("prefs.uuid_queried".concat(String.valueOf(str)));
        edit.remove("prefs.uuid_a2dp_refreshed".concat(String.valueOf(str)));
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet("prefs.known_non_bisto_devices", Collections.emptySet()));
        if (hashSet.remove(str)) {
            edit.putStringSet("prefs.known_non_bisto_devices", hashSet);
        }
        HashSet hashSet2 = new HashSet(sharedPreferences.getStringSet("prefs.known_bisto_devices", Collections.emptySet()));
        if (hashSet2.remove(str)) {
            edit.putStringSet("prefs.known_bisto_devices", hashSet2);
        }
        edit.apply();
    }

    /* renamed from: f */
    public static void m146040f(Set set, SharedPreferences sharedPreferences) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C89680s sVar = (C89680s) it.next();
            C58976aa aaVar = C58975e.f156826a;
            hashSet.add(sVar.f242808a);
            hashSet2.add(sVar.f242808a);
        }
        C58976aa aaVar2 = C58975e.f156826a;
        hashSet.size();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putStringSet("prefs.known_bisto_devices", hashSet);
        HashSet hashSet3 = new HashSet(sharedPreferences.getStringSet("prefs.known_non_bisto_devices", Collections.emptySet()));
        if (hashSet3.removeAll(hashSet2)) {
            edit.putStringSet("prefs.known_non_bisto_devices", hashSet3);
        }
        edit.apply();
    }

    /* renamed from: g */
    public static boolean m146041g(ParcelUuid[] parcelUuidArr) {
        if (parcelUuidArr == null) {
            return false;
        }
        for (ParcelUuid parcelUuid : parcelUuidArr) {
            C58976aa aaVar = C58975e.f156826a;
            if (parcelUuid != null) {
                HashSet hashSet = new HashSet();
                m146055u("f8d1fbe4-7966-4334-8024-ff96c9330e15", hashSet);
                m146055u("81c2e72a-0591-443e-a1ff-05f988593351", hashSet);
                m146055u("150e33c9-96ff-2480-3443-6679e4fbd1f8", hashSet);
                m146055u("51335988-f905-ffa1-3e44-91052ae7c281", hashSet);
                if (hashSet.contains(parcelUuid.getUuid())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m146042h(ParcelUuid[] parcelUuidArr, UUID uuid) {
        if (parcelUuidArr == null) {
            return false;
        }
        for (ParcelUuid parcelUuid : parcelUuidArr) {
            if (parcelUuid != null && parcelUuid.getUuid().equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m146043i(Context context, SharedPreferences sharedPreferences, boolean z) {
        if ((z || !m146036b(sharedPreferences).isEmpty()) && !m146037c(context, sharedPreferences, z).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m146044j(String str, SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        for (C89680s sVar : m146036b(sharedPreferences)) {
            if (sVar.f242808a.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m146045k(String str, SharedPreferences sharedPreferences) {
        Set<C124539a> b = C89652g.m145951a().mo83541b();
        if (b != null) {
            for (C124539a aVar : b) {
                if (aVar.f343619a.getAddress().equals(str)) {
                    C58976aa aaVar = C58975e.f156826a;
                    return true;
                }
            }
        }
        boolean j = m146044j(str, sharedPreferences);
        C58976aa aaVar2 = C58975e.f156826a;
        return j;
    }

    /* renamed from: l */
    public static boolean m146046l(BluetoothDevice bluetoothDevice) {
        return m146042h(bluetoothDevice.getUuids(), f242810b);
    }

    /* renamed from: m */
    public static boolean m146047m(ParcelUuid[] parcelUuidArr) {
        HashSet<UUID> hashSet = new HashSet<>();
        m146055u("0000110b-0000-1000-8000-00805f9b34fb", hashSet);
        m146055u("0000111e-0000-1000-8000-00805f9b34fb", hashSet);
        for (UUID h : hashSet) {
            if (!m146042h(parcelUuidArr, h)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m146048n(SharedPreferences sharedPreferences) {
        for (C89680s sVar : m146036b(sharedPreferences)) {
            if ("wired".equals(sVar.f242808a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public static C124539a m146049o(SharedPreferences sharedPreferences, C68214a aVar, Context context) {
        C124539a aVar2;
        if (!C91076c.m148792a(context)) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
        Set<C124539a> b = C89652g.m145951a().mo83541b();
        boolean z = false;
        if (b != null) {
            aVar2 = null;
            boolean z2 = false;
            for (C124539a aVar3 : b) {
                boolean c = aVar3.mo106454c();
                if (m146052r(aVar3, false, sharedPreferences)) {
                    if (c) {
                        return null;
                    }
                    C124548d b2 = ((C89492cd) aVar.mo27525b()).mo83401b(aVar3.f343619a.getAddress());
                    if (b2 != null && C124707e.INPUT_ONLY_MODE.equals(b2.mo106508g())) {
                        aVar2 = aVar3;
                    }
                } else if (m146047m(aVar3.f343619a.getUuids()) && c) {
                    z2 = true;
                }
            }
            z = z2;
        } else {
            C59104x c2 = f242809a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "DeviceDetector");
            ((C59052c) ((C59052c) c2).mo56372aa(10220)).mo56386p("Unable to get input device: null bluetooth devices");
            aVar2 = null;
        }
        if (z) {
            return aVar2;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return null;
    }

    /* renamed from: p */
    public static void m146050p(C124539a aVar, SharedPreferences sharedPreferences) {
        Set b = m146036b(sharedPreferences);
        if (b.add(new C89680s(aVar.f343619a.getAddress()))) {
            m146040f(b, sharedPreferences);
        }
    }

    /* renamed from: q */
    public static void m146051q(C124539a aVar, SharedPreferences sharedPreferences) {
        C58976aa aaVar = C58975e.f156826a;
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet("prefs.known_non_bisto_devices", Collections.emptySet()));
        hashSet.add(aVar.f343619a.getAddress());
        sharedPreferences.edit().putStringSet("prefs.known_non_bisto_devices", hashSet).apply();
    }

    /* renamed from: r */
    public static boolean m146052r(C124539a aVar, boolean z, SharedPreferences sharedPreferences) {
        ParcelUuid[] parcelUuidArr;
        try {
            parcelUuidArr = aVar.f343619a.getUuids();
        } catch (Exception unused) {
            parcelUuidArr = null;
        }
        if (m146044j(aVar.f343619a.getAddress(), sharedPreferences)) {
            if (z && !m146041g(parcelUuidArr) && aVar.f343619a.getBondState() == 12 && sharedPreferences != null) {
                C59104x d = f242809a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "DeviceDetector");
                ((C59052c) ((C59052c) d).mo56372aa(10243)).mo56386p("UUIDs in BluetoothDevice conflict with sharedPref");
            }
            return true;
        } else if (m146041g(parcelUuidArr)) {
            C59104x b = f242809a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DeviceDetector");
            ((C59052c) ((C59052c) b).mo56372aa(10242)).mo56386p("hasBistoUuid");
            if (sharedPreferences != null) {
                m146050p(aVar, sharedPreferences);
            }
            return true;
        } else if (m146057w()) {
            C59104x b2 = f242809a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "DeviceDetector");
            ((C59052c) ((C59052c) b2).mo56372aa(10241)).mo56386p("shouldReduceSdpRequests; does not have bistoUuid");
            return false;
        } else if (parcelUuidArr != null && !m146047m(parcelUuidArr)) {
            C59104x b3 = f242809a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "DeviceDetector");
            ((C59052c) ((C59052c) b3).mo56372aa(10240)).mo56386p("Is not a headset device");
            return false;
        } else if (!z || aVar.f343619a.getBondState() != 12) {
            C59104x b4 = f242809a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "DeviceDetector");
            ((C59052c) ((C59052c) b4).mo56372aa(10237)).mo56386p("Not bonded or not refresh cache.");
            return false;
        } else if (sharedPreferences == null) {
            return false;
        } else {
            if (sharedPreferences.getStringSet("prefs.known_non_bisto_devices", new HashSet()).contains(aVar.f343619a.getAddress())) {
                C59104x b5 = f242809a.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "DeviceDetector");
                ((C59052c) ((C59052c) b5).mo56372aa(10239)).mo56386p("Marked as a known non-bisto device");
                return false;
            } else if (sharedPreferences.getLong("prefs.uuid_queried".concat(String.valueOf(aVar.f343619a.getAddress())), 0) > System.currentTimeMillis() - f242812d) {
                C59104x b6 = f242809a.mo56224b();
                b6.mo56378ag(C58975e.f156826a, "DeviceDetector");
                ((C59052c) ((C59052c) b6).mo56372aa(10238)).mo56386p("Checked for UUIDs too recently");
                return false;
            } else {
                C59104x b7 = f242809a.mo56224b();
                b7.mo56378ag(C58975e.f156826a, "DeviceDetector");
                ((C59052c) ((C59052c) b7).mo56372aa(10233)).mo56389s("Refreshing UUID cache for device: %s", aVar.f343619a.getAddress());
                aVar.f343619a.fetchUuidsWithSdp();
                sharedPreferences.edit().putLong("prefs.uuid_queried".concat(String.valueOf(aVar.f343619a.getAddress())), System.currentTimeMillis()).apply();
                return false;
            }
        }
    }

    /* renamed from: s */
    public static boolean m146053s(SharedPreferences sharedPreferences, C90931ca caVar, C124539a aVar) {
        ParcelUuid[] parcelUuidArr;
        C59104x b = f242809a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DeviceDetector");
        ((C59052c) ((C59052c) b).mo56372aa(10247)).mo56386p("refreshUuidForA2dpConnected");
        try {
            parcelUuidArr = aVar.f343619a.getUuids();
        } catch (Exception unused) {
            parcelUuidArr = null;
        }
        if (m146044j(aVar.f343619a.getAddress(), sharedPreferences)) {
            if (!m146041g(parcelUuidArr)) {
                C59104x d = f242809a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "DeviceDetector");
                ((C59052c) ((C59052c) d).mo56372aa(10252)).mo56386p("UUIDs in BluetoothDevice conflict with sharedPref.");
            }
            return false;
        } else if (parcelUuidArr != null && !m146047m(parcelUuidArr)) {
            return false;
        } else {
            if (m146041g(parcelUuidArr)) {
                C59104x b2 = f242809a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "DeviceDetector");
                ((C59052c) ((C59052c) b2).mo56372aa(10251)).mo56386p("Not cached as Bisto device but BluetoothDevice has Bisto UUID");
                m146050p(aVar, sharedPreferences);
                return false;
            } else if (aVar.f343619a.getType() == 3 || !m146057w()) {
                int i = sharedPreferences.getInt("prefs.uuid_a2dp_refreshed".concat(String.valueOf(aVar.f343619a.getAddress())), 0);
                if (i > 1) {
                    C59104x b3 = f242809a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "DeviceDetector");
                    ((C59052c) ((C59052c) b3).mo56372aa(10249)).mo56386p("Not refreshing UUIDs on a2dp connect since hit max refreshes");
                    return false;
                }
                C59104x b4 = f242809a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "DeviceDetector");
                ((C59052c) ((C59052c) b4).mo56372aa(10248)).mo56389s("Scheduled to refresh UUIDs: %s", aVar.f343619a.getAddress());
                caVar.mo85137b(new C89679r("uuid_refresh_".concat(String.valueOf(aVar.f343619a.getAddress())), aVar, sharedPreferences, i), f242811c);
                return true;
            } else {
                C59104x b5 = f242809a.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "DeviceDetector");
                ((C59052c) ((C59052c) b5).mo56372aa(10250)).mo56386p("Not dual mode device");
                return false;
            }
        }
    }

    /* renamed from: t */
    public static void m146054t(Context context, SharedPreferences sharedPreferences, C89647bd bdVar, C89433a aVar) {
        C58485gu a = bdVar.mo83537a();
        if (!a.isEmpty()) {
            aVar.mo83342a((UsbDevice) a.get(0));
        } else if (!m146056v() || !C91076c.m148792a(context)) {
            aVar.mo83343b();
        } else {
            Set<C124539a> b = C89652g.m145951a().mo83541b();
            if (b != null) {
                for (C124539a aVar2 : b) {
                    if (m146052r(aVar2, false, sharedPreferences) && aVar2.mo106454c()) {
                        aVar.mo83344c(aVar2);
                        return;
                    }
                }
            } else {
                C59104x c = f242809a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "DeviceDetector");
                ((C59052c) ((C59052c) c).mo56372aa(10232)).mo56386p("Unable to check if devices connected: null bluetooth devices");
            }
            aVar.mo83343b();
        }
    }

    /* renamed from: u */
    private static void m146055u(String str, Set set) {
        try {
            set.add(UUID.fromString(str));
        } catch (Exception e) {
            C59104x d = f242809a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DeviceDetector");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10229)).mo56389s("UUID parse %s", str);
            int i = C90755l.f253831a;
        }
    }

    /* renamed from: v */
    private static boolean m146056v() {
        try {
            if (C89652g.m145951a().f242759a.isEnabled()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: w */
    private static boolean m146057w() {
        return "samsung".equals(Build.BRAND);
    }
}
