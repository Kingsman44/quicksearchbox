package com.google.android.libraries.lens.view.p2162s;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.libraries.p1623at.p1632e.C19557e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.s.k */
/* compiled from: PG */
public final class C27693k implements C27692j {

    /* renamed from: a */
    private static final C58495hd f75618a = C58495hd.m89901o("com.google.lens.feature.CAMERA_INTEGRATION", "ro.com.google.lens.oem_camera_package", "com.google.lens.feature.IMAGE_INTEGRATION", "ro.com.google.lens.oem_image_package");

    /* renamed from: b */
    private final PackageManager f75619b;

    /* renamed from: c */
    private final C21370a f75620c;

    static {
        C58974d.m91135i("LensGtsEligibilityChkr");
    }

    public C27693k(PackageManager packageManager, C21370a aVar) {
        this.f75619b = packageManager;
        this.f75620c = aVar;
    }

    /* renamed from: a */
    public final boolean mo33178a(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C58800sl lA = f75618a.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            String str2 = (String) entry.getValue();
            this.f75620c.mo26872d();
            if (this.f75619b.hasSystemFeature((String) entry.getKey())) {
                String b = C19557e.m37300b(str2, (String) null);
                this.f75620c.mo26872d();
                if (!TextUtils.isEmpty(b)) {
                    Iterator it = C58869cf.m90936b(new C58903m(',')).mo56153g(b).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            continue;
                            break;
                        } else if (str.equals(((String) it.next()).trim())) {
                            this.f75620c.mo26872d();
                            try {
                                this.f75619b.getApplicationInfo(str, 1048576);
                                z = true;
                            } catch (PackageManager.NameNotFoundException unused) {
                                z = false;
                            }
                            this.f75620c.mo26872d();
                            if (z) {
                                return true;
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }
}
