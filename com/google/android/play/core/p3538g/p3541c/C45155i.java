package com.google.android.play.core.p3538g.p3541c;

import android.content.Intent;
import android.net.Uri;
import com.google.android.play.core.p3538g.C45137aw;
import com.google.android.play.core.p3542h.C45196e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.g.c.i */
/* compiled from: PG */
public final /* synthetic */ class C45155i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C45160n f117872a;

    /* renamed from: b */
    public final /* synthetic */ List f117873b;

    /* renamed from: c */
    public final /* synthetic */ List f117874c;

    public /* synthetic */ C45155i(C45160n nVar, List list, List list2) {
        this.f117872a = nVar;
        this.f117873b = list;
        this.f117874c = list2;
    }

    public final void run() {
        C45160n nVar = this.f117872a;
        List<File> list = this.f117873b;
        List list2 = this.f117874c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (File file : list) {
            String a = C45196e.m80474a(file);
            Uri fromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, nVar.f117885b.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", C45160n.m80386k(a));
            intent.putExtra("split_id", a);
            arrayList.add(intent);
            arrayList2.add(C45160n.m80386k(C45196e.m80474a(file)));
        }
        C45137aw j = nVar.mo49003j();
        if (j != null) {
            nVar.f117888e.execute(new C45152f(nVar, j.mo48949e(), arrayList, arrayList2, list2));
        }
    }
}
