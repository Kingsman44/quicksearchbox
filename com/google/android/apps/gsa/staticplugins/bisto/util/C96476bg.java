package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.ParcelUuid;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.shared.bisto.C89681t;
import com.google.android.apps.gsa.shared.util.C90732ap;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.bg */
/* compiled from: PG */
public final class C96476bg extends ScanCallback {

    /* renamed from: a */
    public static final C59071e f269911a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.util.bg");

    /* renamed from: b */
    public static final long f269912b = TimeUnit.SECONDS.toMillis(25);

    /* renamed from: g */
    private static final C58485gu f269913g = C58485gu.m89852t("WH-1000XM2", "WI-1000X", "WH-1000XM3", "WH-H900N", "WI-SP600N", "WH-CH700N", "WF-SP700N");

    /* renamed from: h */
    private static final C58528ij f269914h = C58528ij.m90015O("00:01:4A", "00:13:A9", "00:1A:80", "00:1D:BA", "00:24:BE", "04:5D:4B", "08:00:46", "10:4F:A8", "30:F9:ED", "3C:07:71", "54:42:49", "54:53:ED", "70:26:05", "78:84:3C", "AC:9B:0A", "CC:98:8B", "D8:D4:3C", "F0:BF:97", "FC:F1:52");

    /* renamed from: i */
    private static final UUID f269915i = UUID.fromString("0000fe26-0000-1000-8000-00805f9b34fb");

    /* renamed from: j */
    private static final long f269916j = TimeUnit.HOURS.toMillis(12);

    /* renamed from: c */
    public final Context f269917c;

    /* renamed from: d */
    public final C90931ca f269918d;

    /* renamed from: e */
    public final AtomicReference f269919e = new AtomicReference();

    /* renamed from: f */
    public final AtomicReference f269920f = new AtomicReference();

    /* renamed from: k */
    private final SharedPreferences f269921k;

    /* renamed from: l */
    private final C21370a f269922l;

    public C96476bg(Context context, SharedPreferences sharedPreferences, C90931ca caVar, C21370a aVar) {
        this.f269917c = context;
        this.f269921k = sharedPreferences;
        this.f269918d = caVar;
        this.f269922l = aVar;
    }

    /* renamed from: a */
    public static void m159854a(String str, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().remove("prefs.bisto_upgrade_notification_count-".concat(String.valueOf(str))).remove("prefs.bisto_upgrade_notification_timestamp-".concat(String.valueOf(str))).apply();
    }

    /* renamed from: c */
    public static boolean m159855c(BluetoothDevice bluetoothDevice) {
        C58485gu guVar = f269913g;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (i2 < i) {
            String str = (String) guVar.get(i2);
            String name = bluetoothDevice.getName();
            boolean z = true;
            if (!str.equalsIgnoreCase(name) && !"LE-".concat(String.valueOf(str)).equalsIgnoreCase(name)) {
                z = false;
            }
            i2++;
            if (z) {
                if (bluetoothDevice.getAddress().length() < 8) {
                    C59104x d = f269911a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "UpgradedDeviceScanner");
                    ((C59052c) ((C59052c) d).mo56372aa(17231)).mo56386p("Bad MAC address");
                    return false;
                }
                return f269914h.contains(bluetoothDevice.getAddress().substring(0, 8).toUpperCase(Locale.US));
            }
        }
        return false;
    }

    /* renamed from: d */
    private final void m159856d(BluetoothDevice bluetoothDevice) {
        Intent intent;
        if (!m159855c(bluetoothDevice)) {
            return;
        }
        if (this.f269921k.getInt("prefs.bisto_upgrade_notification_count-".concat(String.valueOf(bluetoothDevice.getAddress())), 0) >= 3) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        if (this.f269922l.mo26870b() - this.f269921k.getLong("prefs.bisto_upgrade_notification_timestamp-".concat(String.valueOf(bluetoothDevice.getAddress())), 0) < f269916j) {
            C58976aa aaVar2 = C58975e.f156826a;
            return;
        }
        Intent launchIntentForPackage = this.f269917c.getPackageManager().getLaunchIntentForPackage("com.sony.songpal.mdr");
        Context context = this.f269917c;
        if (launchIntentForPackage != null) {
            intent = launchIntentForPackage;
        } else {
            intent = C90732ap.m148195a(context, "com.sony.songpal.mdr");
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 335544320);
        Context context2 = this.f269917c;
        C1839z b = C96460ar.m159822b(context2, context2.getString(R.string.first_ota_notification_title), this.f269917c.getString(launchIntentForPackage != null ? R.string.first_ota_notification_text_open_sony : R.string.first_ota_notification_text_install_sony), C96460ar.f269856c, C58836b.f156633a);
        b.f5687g = activity;
        b.mo5016e(0, this.f269917c.getString(launchIntentForPackage != null ? R.string.first_ota_notification_button_open_sony : R.string.first_ota_notification_button_install_sony), activity);
        b.mo5015d(16, true);
        ((NotificationManager) this.f269917c.getSystemService("notification")).notify(50, b.mo5013a());
        this.f269921k.edit().putInt("prefs.bisto_upgrade_notification_count-".concat(String.valueOf(bluetoothDevice.getAddress())), this.f269921k.getInt("prefs.bisto_upgrade_notification_count-".concat(String.valueOf(bluetoothDevice.getAddress())), 0) + 1).putLong("prefs.bisto_upgrade_notification_timestamp-".concat(String.valueOf(bluetoothDevice.getAddress())), this.f269922l.mo26870b()).apply();
        C59104x b2 = f269911a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "UpgradedDeviceScanner");
        ((C59052c) ((C59052c) b2).mo56372aa(17221)).mo56386p("Notified user of upgrade");
    }

    /* renamed from: b */
    public final void mo90170b(BluetoothDevice bluetoothDevice, boolean z) {
        BluetoothLeScanner bluetoothLeScanner = (BluetoothLeScanner) this.f269919e.get();
        BluetoothDevice bluetoothDevice2 = (BluetoothDevice) this.f269920f.get();
        if (!(bluetoothLeScanner == null || bluetoothDevice2 == null || !bluetoothDevice2.getAddress().equals(bluetoothDevice.getAddress()))) {
            C59104x b = f269911a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "UpgradedDeviceScanner");
            ((C59052c) ((C59052c) b).mo56372aa(17230)).mo56386p("Stopping scan");
            this.f269919e.set((Object) null);
            this.f269920f.set((Object) null);
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                bluetoothLeScanner.stopScan(this);
            }
        }
        if (z) {
            m159856d(bluetoothDevice);
        }
    }

    public final void onScanFailed(int i) {
        super.onScanFailed(i);
        C59104x c = f269911a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "UpgradedDeviceScanner");
        ((C59052c) ((C59052c) c).mo56372aa(17222)).mo56387q("onScanFailed. errorCode=%d", i);
    }

    public final void onScanResult(int i, ScanResult scanResult) {
        ScanRecord scanRecord;
        super.onScanResult(i, scanResult);
        C58976aa aaVar = C58975e.f156826a;
        String address = scanResult.getDevice().getAddress();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) this.f269920f.get();
        if (bluetoothDevice != null && bluetoothDevice.getAddress().equals(address) && (scanRecord = scanResult.getScanRecord()) != null) {
            mo90170b(bluetoothDevice, false);
            Map<ParcelUuid, byte[]> serviceData = scanRecord.getServiceData();
            if (serviceData != null) {
                for (ParcelUuid next : serviceData.keySet()) {
                    if (next != null && f269915i.equals(next.getUuid())) {
                        C59104x b = f269911a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "UpgradedDeviceScanner");
                        ((C59052c) ((C59052c) b).mo56372aa(17225)).mo56386p("Found ble uuid");
                        C89681t.m146039e(bluetoothDevice.getAddress(), this.f269921k);
                        C89681t.m146053s(this.f269921k, this.f269918d, new C124539a(bluetoothDevice));
                        return;
                    }
                }
            }
            m159856d(bluetoothDevice);
        }
    }
}
