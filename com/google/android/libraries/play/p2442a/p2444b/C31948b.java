package com.google.android.libraries.play.p2442a.p2444b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.play.p2442a.p2443a.C31945a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.frameworks.client.data.android.p4634b.C61383b;
import java.util.Iterator;
import java.util.List;
import p5488io.grpc.C70286co;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.binder.C70225e;

/* renamed from: com.google.android.libraries.play.a.b.b */
/* compiled from: PG */
public final class C31948b {

    /* renamed from: a */
    private static final C58528ij f85922a = new C58759qy("com.android.vending");

    /* renamed from: a */
    public static C70286co m59516a(Context context) {
        C58833ax axVar;
        Intent intent = new Intent("com.google.android.finsky.ipcservers.external.APP_CONTENT_SERVICE").setPackage("com.android.vending");
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 64);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ((C59052c) ((C59052c) C31945a.f85920a.mo56226d()).mo56372aa(50469)).mo56389s("Did not find valid ComponentInfo for service from package %s.", "com.android.vending");
                    axVar = C58836b.f156633a;
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && !TextUtils.isEmpty(serviceInfo.packageName) && !TextUtils.isEmpty(serviceInfo.name)) {
                    axVar = C58833ax.m90834k(new ComponentName(serviceInfo.packageName, serviceInfo.name));
                    break;
                }
            }
        } else {
            ((C59052c) ((C59052c) C31945a.f85920a.mo56226d()).mo56372aa(50468)).mo56389s("Failed to get AppContentService for package %s.", "com.android.vending");
            axVar = C58836b.f156633a;
        }
        if (!axVar.mo56113h()) {
            return null;
        }
        C70225e a = C70225e.m102371a(new C70175a(intent.setComponent((ComponentName) axVar.mo56107c()).cloneFilter()), context);
        a.mo61889e(new C61383b(context.getPackageManager(), f85922a, C143701ac.m233450a(context)));
        return a.f187197a.mo57963c();
    }
}
