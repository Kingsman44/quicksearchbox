package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a.p2746a;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.a.f */
/* compiled from: PG */
public final class C35794f implements C35791c {

    /* renamed from: d */
    private static final C59071e f93765d = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.a.f");

    /* renamed from: a */
    public final String f93766a;

    /* renamed from: b */
    public volatile boolean f93767b;

    /* renamed from: c */
    public volatile C35790b f93768c;

    /* renamed from: e */
    private final CameraManager f93769e;

    /* renamed from: f */
    private final CameraManager.TorchCallback f93770f;

    /* renamed from: g */
    private final C46428ao f93771g;

    public C35794f(CameraManager cameraManager, C46428ao aoVar) {
        String str;
        this.f93769e = cameraManager;
        this.f93771g = aoVar;
        String str2 = null;
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            ArrayList arrayList = new ArrayList();
            for (String str3 : cameraIdList) {
                CameraCharacteristics cameraCharacteristics = this.f93769e.getCameraCharacteristics(str3);
                Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (!(bool == null || num == null)) {
                    arrayList.add(new C35789a(str3, bool, num));
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                str = null;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C35793e eVar = (C35793e) it.next();
                    String c = eVar.mo39841c();
                    boolean booleanValue = eVar.mo39839a().booleanValue();
                    int intValue = eVar.mo39840b().intValue();
                    if (booleanValue) {
                        if (intValue == 1) {
                            str = c;
                            break;
                        } else if (str == null) {
                            str = c;
                        }
                    }
                }
            } else {
                str = null;
            }
            C58976aa aaVar = C58975e.f156826a;
            str2 = str;
        } catch (Exception unused) {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        this.f93766a = str2;
        this.f93770f = new C35792d(this);
    }

    /* renamed from: a */
    public final void mo39845a() {
        this.f93769e.registerTorchCallback(this.f93770f, this.f93771g);
    }

    /* renamed from: b */
    public final boolean mo39846b() {
        C58976aa aaVar = C58975e.f156826a;
        return this.f93767b;
    }

    /* renamed from: c */
    public final boolean mo39847c(boolean z) {
        boolean z2;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this) {
            z2 = false;
            try {
                String str = this.f93766a;
                if (str != null) {
                    this.f93769e.setTorchMode(str, z);
                    this.f93767b = z;
                    z2 = true;
                }
            } catch (Exception e) {
                C59104x c = f93765d.mo56225c();
                c.mo56378ag(C58975e.f156826a, "FlashlightControllerImpl");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(52064)).mo56386p("#toggleFlashlight failed.");
            }
        }
        return z2;
    }

    /* renamed from: d */
    public final void mo39848d() {
    }
}
