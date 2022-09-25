package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.io.File;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.s */
/* compiled from: PG */
public final /* synthetic */ class C116063s implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116070z f321825a;

    /* renamed from: b */
    public final /* synthetic */ List f321826b;

    /* renamed from: c */
    public final /* synthetic */ String f321827c;

    public /* synthetic */ C116063s(C116070z zVar, List list, String str) {
        this.f321825a = zVar;
        this.f321826b = list;
        this.f321827c = str;
    }

    public final void run() {
        File[] listFiles;
        C116070z zVar = this.f321825a;
        List<C22845p> list = this.f321826b;
        String str = this.f321827c;
        File file = new File(zVar.f321841b.getFilesDir(), "recently");
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            HashSet hashSet = new HashSet();
            for (C22845p pVar : list) {
                if ((pVar.f62892a & 128) != 0) {
                    hashSet.add(Long.valueOf(pVar.f62899h));
                }
            }
            int length = str.length() + 1;
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (name.startsWith(str) && name.endsWith(".jpg")) {
                    Long valueOf = Long.valueOf(Long.parseLong(name.subSequence(length, name.length() - 4).toString()));
                    if (!hashSet.contains(valueOf)) {
                        file2.delete();
                    } else {
                        hashSet.remove(valueOf);
                    }
                }
            }
        }
    }
}
