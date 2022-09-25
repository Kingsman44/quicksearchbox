package androidx.camera.core;

import androidx.camera.core.p069a.C1299am;
import androidx.camera.core.p069a.C1300an;
import androidx.camera.core.p069a.C1302ap;
import androidx.camera.core.p069a.C1304ar;
import androidx.camera.core.p069a.p070a.C1285p;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p071a.C1247j;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p069a.p070a.p072b.C1264m;
import androidx.camera.core.p073b.p074a.p075a.C1428a;
import androidx.camera.core.p073b.p074a.p075a.C1429b;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.bd */
/* compiled from: PG */
public final /* synthetic */ class C1458bd implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C1470bp f4035a;

    public /* synthetic */ C1458bd(C1470bp bpVar) {
        this.f4035a = bpVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C60870cx cxVar;
        String str;
        C1299am amVar;
        C1470bp bpVar = this.f4035a;
        bpVar.f4066j.mo4207j(new C1422aw(cVar), C1247j.m3414a());
        synchronized (bpVar.f4059c) {
            if (bpVar.f4059c.get() == null) {
                bpVar.f4059c.set(Integer.valueOf(bpVar.mo4351g()));
            }
        }
        C1477bw.m3978a("ImageCapture", "issueTakePicture");
        ArrayList arrayList = new ArrayList();
        if (bpVar.f4067k != null) {
            amVar = bpVar.mo4352h(C1405af.m3853a());
            List list = ((C1404ae) amVar).f3951a;
            if (list == null) {
                cxVar = new C1264m(new IllegalArgumentException("ImageCapture has CaptureBundle with null capture stages"));
            } else if (bpVar.f4064h == null && list.size() > 1) {
                cxVar = new C1264m(new IllegalArgumentException("No CaptureProcessor can be found to process the images captured for multiple CaptureStages."));
            } else if (list.size() > bpVar.f4063g) {
                cxVar = new C1264m(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            } else {
                bpVar.f4067k.mo4389m(amVar);
                C1517cu cuVar = bpVar.f4067k;
                Executor a = C1238a.m3410a();
                C1459be beVar = new C1459be();
                synchronized (cuVar.f4166a) {
                    cuVar.f4181p = a;
                    cuVar.f4182q = beVar;
                }
                str = bpVar.f4067k.f4178m;
            }
            C1263l.m3436h(cxVar, new C1462bh(bpVar, cVar), bpVar.f4061e);
            cVar.mo5436a(new C1423ax(cxVar), C1238a.m3410a());
            return "takePictureInternal";
        }
        amVar = bpVar.mo4352h(C1405af.m3853a());
        List list2 = ((C1404ae) amVar).f3951a;
        if (list2 == null) {
            cxVar = new C1264m(new IllegalArgumentException("ImageCapture has CaptureBundle with null capture stages"));
        } else if (list2.size() > 1) {
            cxVar = new C1264m(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
        } else {
            str = null;
        }
        C1263l.m3436h(cxVar, new C1462bh(bpVar, cVar), bpVar.f4061e);
        cVar.mo5436a(new C1423ax(cxVar), C1238a.m3410a());
        return "takePictureInternal";
        for (C1304ar arVar : ((C1404ae) amVar).f3951a) {
            C1300an anVar = new C1300an();
            C1302ap apVar = bpVar.f4062f;
            anVar.f3742c = apVar.f3751e;
            anVar.mo4161e(apVar.f3750d);
            anVar.mo4158b(Collections.unmodifiableList(bpVar.f4065i.f3836f));
            anVar.mo4162f(bpVar.f4069m);
            if (bpVar.mo4413o() == 256) {
                if (((C1429b) C1428a.f3989a.mo4225a(C1429b.class)) == null) {
                    anVar.mo4160d(C1302ap.f3747a, 0);
                }
                anVar.mo4160d(C1302ap.f3748b, 0);
            }
            anVar.mo4161e(arVar.f3756a.f3750d);
            if (str != null) {
                anVar.f3744e.mo4220b(str, 0);
            }
            anVar.mo4159c(bpVar.f4068l);
            arrayList.add(anVar.mo4157a());
        }
        C1285p.m3462a();
        cxVar = C1263l.m3433e(bpVar.mo4415q().mo4036e(arrayList, bpVar.f4058b, bpVar.f4060d), C1420au.f3976a, C1238a.m3410a());
        C1263l.m3436h(cxVar, new C1462bh(bpVar, cVar), bpVar.f4061e);
        cVar.mo5436a(new C1423ax(cxVar), C1238a.m3410a());
        return "takePictureInternal";
    }
}
