package androidx.mediarouter.p175a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: androidx.mediarouter.a.cb */
/* compiled from: PG */
final class C3720cb {

    /* renamed from: a */
    public final Context f11943a;

    /* renamed from: b */
    final C3719ca f11944b;

    /* renamed from: c */
    public final Handler f11945c;

    /* renamed from: d */
    public boolean f11946d;

    /* renamed from: e */
    public final BroadcastReceiver f11947e = new C3715bx(this);

    /* renamed from: f */
    public final Runnable f11948f = new C3716by(this);

    /* renamed from: g */
    private final PackageManager f11949g;

    /* renamed from: h */
    private final ArrayList f11950h = new ArrayList();

    public C3720cb(Context context, C3719ca caVar) {
        this.f11943a = context;
        this.f11944b = caVar;
        this.f11945c = new Handler();
        this.f11949g = context.getPackageManager();
    }

    /* renamed from: a */
    public final void mo7841a() {
        this.f11945c.post(this.f11948f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo7842b() {
        int i;
        if (this.f11946d) {
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList2 = new ArrayList();
                for (ResolveInfo resolveInfo : this.f11949g.queryIntentServices(intent, 0)) {
                    arrayList2.add(resolveInfo.serviceInfo);
                }
                arrayList = arrayList2;
            }
            Iterator<ResolveInfo> it = this.f11949g.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i2 = 0;
            while (true) {
                int i3 = -1;
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    if (C3687aw.m10686o() && !arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            ServiceInfo serviceInfo2 = (ServiceInfo) it2.next();
                            if (serviceInfo.packageName.equals(serviceInfo2.packageName) && serviceInfo.name.equals(serviceInfo2.name)) {
                                break;
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = this.f11950h.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        C3713bv bvVar = (C3713bv) this.f11950h.get(i4);
                        if (bvVar.f11931b.getPackageName().equals(str) && bvVar.f11931b.getClassName().equals(str2)) {
                            i3 = i4;
                            break;
                        }
                        i4++;
                    }
                    if (i3 < 0) {
                        C3713bv bvVar2 = new C3713bv(this.f11943a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        bvVar2.f11937p = new C3714bw(this);
                        bvVar2.mo7831m();
                        i = i2 + 1;
                        this.f11950h.add(i2, bvVar2);
                        this.f11944b.mo7737g(bvVar2);
                    } else if (i3 >= i2) {
                        C3713bv bvVar3 = (C3713bv) this.f11950h.get(i3);
                        bvVar3.mo7831m();
                        if (bvVar3.f11935n == null && bvVar3.mo7836p()) {
                            bvVar3.mo7832n();
                            bvVar3.mo7824e();
                        }
                        i = i2 + 1;
                        Collections.swap(this.f11950h, i3, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < this.f11950h.size()) {
                for (int size2 = this.f11950h.size() - 1; size2 >= i2; size2--) {
                    C3713bv bvVar4 = (C3713bv) this.f11950h.get(size2);
                    this.f11944b.mo7740j(bvVar4);
                    this.f11950h.remove(bvVar4);
                    bvVar4.f11937p = null;
                    if (bvVar4.f11934m) {
                        if (C3713bv.f11930a) {
                            new StringBuilder().append(bvVar4);
                            Log.d("MediaRouteProviderProxy", bvVar4.toString().concat(": Stopping"));
                        }
                        bvVar4.f11934m = false;
                        bvVar4.mo7833o();
                    }
                }
            }
        }
    }
}
