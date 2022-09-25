package com.google.android.libraries.lens.sdk.p2045c;

import android.content.pm.PackageManager;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.sdk.c.h */
/* compiled from: PG */
public final class C24923h {

    /* renamed from: a */
    public static final C59071e f68044a = C59071e.m91332i("com.google.android.libraries.lens.sdk.c.h");

    /* renamed from: b */
    public final Executor f68045b;

    /* renamed from: c */
    public final PackageManager f68046c;

    /* renamed from: d */
    public final Map f68047d;

    /* renamed from: e */
    final Map f68048e = new HashMap();

    /* renamed from: f */
    final Map f68049f = new HashMap();

    public C24923h(Executor executor, PackageManager packageManager, Map map) {
        this.f68045b = executor;
        this.f68046c = packageManager;
        this.f68047d = map;
    }

    /* renamed from: a */
    public final void mo30141a(C24914a aVar) {
        for (Map.Entry entry : this.f68048e.entrySet()) {
            if (aVar.mo30135b((String) entry.getKey())) {
                ((C24927l) entry.getValue()).mo30131a(aVar);
            }
        }
        this.f68049f.remove(Integer.valueOf(aVar.f68026a));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry key : this.f68048e.entrySet()) {
            String str = (String) key.getKey();
            Iterator it = this.f68049f.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C24914a) it.next()).mo30135b(str)) {
                        break;
                    }
                } else {
                    arrayList.add(str);
                    break;
                }
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f68048e.remove((String) arrayList.get(i));
        }
    }
}
