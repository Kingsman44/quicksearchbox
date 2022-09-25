package com.google.android.apps.gsa.speech.p7272e.p7274b;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.speech.e.b.d */
/* compiled from: PG */
final class C92242d extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C92248j f257179a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92242d(C92248j jVar) {
        super("update resource list", 2, 0);
        this.f257179a = jVar;
    }

    public final void run() {
        ArrayList b;
        File[] listFiles;
        int length;
        C92260v vVar;
        File[] listFiles2;
        int length2;
        File[] listFiles3;
        int length3;
        File[] fileArr;
        int i;
        File[] listFiles4;
        C8476as asVar;
        C92248j jVar = this.f257179a;
        HashMap hashMap = new HashMap();
        C58480gp e = C58485gu.m89837e();
        int i2 = 0;
        File dir = jVar.f257189c.getDir("g3_models", 0);
        if (dir != null) {
            e.mo55395g(dir);
        }
        for (String file : C92248j.m151461c()) {
            e.mo55395g(new File(file));
        }
        C58801sm G = e.mo55394f().listIterator(0);
        while (G.hasNext()) {
            File file2 = (File) G.next();
            C58838bb.m90883r(file2.isAbsolute());
            File[] listFiles5 = file2.listFiles(C92248j.f257187b);
            if (listFiles5 != null) {
                for (File file3 : listFiles5) {
                    String name = file3.getName();
                    if (C92248j.m151462m(name)) {
                        ((C59052c) ((C59052c) C92248j.f257186a.mo56224b()).mo56372aa(12297)).mo56389s("#handleLocale  %s", name);
                        C92260v vVar2 = (C92260v) hashMap.get(name);
                        if (vVar2 == null) {
                            vVar2 = jVar.mo86924b();
                            hashMap.put(name, vVar2);
                        }
                        C58838bb.m90884s(vVar2.f257244h == null, "Paths have already been processed, cannot add a new path.");
                        if (!vVar2.f257241e.contains(file3)) {
                            vVar2.f257241e.add(file3);
                        }
                    }
                }
            }
        }
        for (C92260v vVar3 : hashMap.values()) {
            if (vVar3.f257241e.isEmpty()) {
                ((C59052c) ((C59052c) C92260v.f257237a.mo56225c()).mo56372aa(12337)).mo56386p("No paths have been added, cannot process.");
            } else {
                File file4 = null;
                for (File file5 : vVar3.f257241e) {
                    C8476as a = C92260v.m151491a(file5);
                    if (a == null) {
                        ((C59052c) ((C59052c) C92260v.f257237a.mo56225c()).mo56372aa(12336)).mo56389s("Unparsable metadata at: %s", file5);
                    } else {
                        if (!vVar3.f257245i) {
                            for (String startsWith : C92248j.m151461c()) {
                                if (file5.getAbsolutePath().startsWith(startsWith)) {
                                    vVar3.f257245i = true;
                                }
                            }
                        }
                        if (C92258t.m151490d(a, vVar3.f257238b, Integer.MAX_VALUE) && ((asVar = vVar3.f257244h) == null || a.f29419d > asVar.f29419d)) {
                            vVar3.f257243g = file5.getAbsolutePath();
                            vVar3.f257244h = a;
                            file4 = file5;
                        }
                    }
                }
                vVar3.f257241e.clear();
                if (vVar3.f257244h == null) {
                    ((C59052c) ((C59052c) C92260v.f257237a.mo56225c()).mo56372aa(12332)).mo56386p("No compatible language pack metadata found.");
                } else {
                    File[] listFiles6 = file4.listFiles();
                    if (listFiles6 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (File file6 : listFiles6) {
                            if (!file6.isDirectory()) {
                                arrayList.add(file6);
                            } else if (file6.getName().equals("configs") && (listFiles4 = file6.listFiles()) != null) {
                                Collections.addAll(arrayList, listFiles4);
                            }
                        }
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            File file7 = (File) arrayList.get(i3);
                            C92252n a2 = C92252n.m151478a(file7);
                            if (a2 != null && !vVar3.f257240d.containsKey(a2)) {
                                vVar3.f257240d.put(a2, file7.getAbsolutePath());
                            }
                        }
                    }
                }
            }
        }
        jVar.f257196j = new File(jVar.f257189c.getCacheDir(), "g3_grammars");
        if (!(jVar.f257196j == null || (listFiles = jVar.f257196j.listFiles(C92248j.f257187b)) == null || (length = listFiles.length) == 0)) {
            int i4 = 0;
            while (i4 < length) {
                File file8 = listFiles[i4];
                String name2 = file8.getName();
                if (!(!C92248j.m151462m(name2) || (vVar = (C92260v) hashMap.get(name2)) == null || (listFiles2 = file8.listFiles(C92248j.f257187b)) == null || (length2 = listFiles2.length) == 0)) {
                    int i5 = 0;
                    while (i5 < length2) {
                        File file9 = listFiles2[i5];
                        C92249k b2 = C92249k.m151477b(file9);
                        if (!(b2 == null || (listFiles3 = file9.listFiles(C92248j.f257187b)) == null || (length3 = listFiles3.length) == 0)) {
                            String a3 = jVar.f257190d.mo86936a(b2);
                            while (i2 < length3) {
                                File file10 = listFiles3[i2];
                                if (!file10.getName().equals(a3)) {
                                    fileArr = listFiles;
                                    i = length;
                                    jVar.f257193g.mo86922a(file10, false, (Runnable) null);
                                } else {
                                    fileArr = listFiles;
                                    i = length;
                                    C58838bb.m90884s(vVar.f257239c.isEmpty(), "Grammars have already been processed, cannot add another.");
                                    C8476as a4 = C92260v.m151491a(file10);
                                    if (a4 != null) {
                                        vVar.f257242f.add(new C92259u(b2, a3, file10, a4));
                                    }
                                }
                                i2++;
                                length = i;
                                listFiles = fileArr;
                            }
                        }
                        i5++;
                        length = length;
                        listFiles = listFiles;
                        i2 = 0;
                    }
                }
                i4++;
                length = length;
                listFiles = listFiles;
                i2 = 0;
            }
            C58557jl.m90145z(hashMap.values(), C92241c.f257178a);
        }
        jVar.mo86934n(hashMap);
        for (C92260v vVar4 : hashMap.values()) {
            C8476as asVar2 = vVar4.f257244h;
            if (asVar2 == null) {
                ((C59052c) ((C59052c) C92248j.f257186a.mo56226d()).mo56372aa(12309)).mo56389s("found locale resource with no metadata %s", vVar4.f257243g);
            } else {
                ((C59052c) ((C59052c) C92248j.f257186a.mo56224b()).mo56372aa(12307)).mo56352E("available language pack of %s is version %d", asVar2.f29417b, asVar2.f29419d);
            }
        }
        synchronized (jVar) {
            b = C58597ky.m90211b(jVar.f257192f);
            jVar.f257194h = hashMap;
            jVar.f257192f.clear();
            int i6 = jVar.f257195i - 1;
            jVar.f257195i = i6;
            C58838bb.m90883r(i6 >= 0);
            jVar.notifyAll();
        }
        int size2 = b.size();
        for (int i7 = 0; i7 < size2; i7++) {
            jVar.f257191e.mo85151p((C90936cf) b.get(i7));
        }
    }
}
