package com.google.android.play.core.p3538g;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.play.core.p3529c.C45053a;
import com.google.android.play.core.p3533e.C45079k;
import com.google.android.play.core.p3542h.C45192a;
import com.google.android.play.core.p3542h.C45195d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.play.core.g.au */
/* compiled from: PG */
final class C45135au {

    /* renamed from: a */
    public static final C45053a f117829a = new C45053a("SplitInstallService");

    /* renamed from: d */
    private static final Intent f117830d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* renamed from: b */
    public final String f117831b;

    /* renamed from: c */
    C45079k f117832c;

    public C45135au(Context context, String str) {
        this.f117831b = str;
        if (C45195d.m80473a(context)) {
            this.f117832c = new C45079k(C45192a.m80471a(context), f117829a, "SplitInstallService", f117830d, C45123ai.f117809a);
        }
    }

    /* renamed from: a */
    public static Bundle m80335a() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        return bundle;
    }

    /* renamed from: b */
    public static C146006ab m80336b() {
        f117829a.mo48884b("onError(%d)", -14);
        return C146021aq.m237849c(new C45179n(-14));
    }

    /* renamed from: c */
    public static ArrayList m80337c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("language", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: d */
    public static ArrayList m80338d(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }
}
