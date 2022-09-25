package com.google.android.apps.gsa.staticplugins.actions.p7361g;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.apps.gsa.search.shared.actions.util.C87483e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.g.h */
/* compiled from: PG */
public final class C93394h extends C93387a {

    /* renamed from: d */
    public final CameraManager f260479d;

    /* renamed from: e */
    public final CameraManager.TorchCallback f260480e = new C93393g(this);

    /* renamed from: f */
    public final String f260481f;

    public C93394h(Context context) {
        String str;
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        this.f260479d = cameraManager;
        String str2 = null;
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (String str3 : cameraIdList) {
                CameraCharacteristics cameraCharacteristics = this.f260479d.getCameraCharacteristics(str3);
                Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (!(bool == null || num == null)) {
                    arrayList.add(Pair.create(str3, Pair.create(bool, num)));
                }
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                str = null;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Pair pair = (Pair) arrayList.get(i);
                    String str4 = (String) pair.first;
                    boolean booleanValue = ((Boolean) ((Pair) pair.second).first).booleanValue();
                    int intValue = ((Integer) ((Pair) pair.second).second).intValue();
                    if (booleanValue) {
                        if (intValue == 1) {
                            str = str4;
                            break;
                        } else if (str == null) {
                            str = str4;
                        }
                    }
                    i++;
                }
            } else {
                str = null;
            }
            C58976aa aaVar = C58975e.f156826a;
            str2 = str;
        } catch (Exception unused) {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        this.f260481f = str2;
    }

    /* renamed from: b */
    public final void mo81471b(C87483e eVar) {
        this.f260467b = eVar;
        this.f260479d.registerTorchCallback(this.f260480e, new Handler(Looper.getMainLooper()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo87651h() {
        C58976aa aaVar = C58975e.f156826a;
        return this.f260481f != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo87652i() {
        try {
            C58976aa aaVar = C58975e.f156826a;
            String str = this.f260481f;
            if (str == null) {
                return false;
            }
            CameraManager cameraManager = this.f260479d;
            boolean z = this.f260466a;
            cameraManager.setTorchMode(str, !this.f260466a);
            this.f260466a = !this.f260466a;
            boolean z2 = this.f260466a;
            return true;
        } catch (Exception unused) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        }
    }
}
