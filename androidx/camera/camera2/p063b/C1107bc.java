package androidx.camera.camera2.p063b;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageWriter;
import androidx.camera.camera2.p062a.C0988a;
import androidx.camera.camera2.p063b.p064a.p067c.C1051i;
import androidx.camera.core.C1473bs;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1300an;
import androidx.camera.core.p069a.C1302ap;
import androidx.camera.core.p069a.C1390q;
import androidx.camera.core.p069a.p070a.p072b.C1252a;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.bc */
/* compiled from: PG */
public final /* synthetic */ class C1107bc implements C1252a {

    /* renamed from: a */
    public final /* synthetic */ C1112bh f3296a;

    /* renamed from: b */
    public final /* synthetic */ List f3297b;

    /* renamed from: c */
    public final /* synthetic */ int f3298c;

    public /* synthetic */ C1107bc(C1112bh bhVar, List list, int i) {
        this.f3296a = bhVar;
        this.f3297b = list;
        this.f3298c = i;
    }

    /* renamed from: a */
    public final C60870cx mo3782a(Object obj) {
        int i;
        C1473bs a;
        C1112bh bhVar = this.f3296a;
        List<C1302ap> list = this.f3297b;
        int i2 = this.f3298c;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1302ap apVar : list) {
            C1300an anVar = new C1300an(apVar);
            C1131c cVar = null;
            if (apVar.f3751e == 5) {
                C1198em emVar = bhVar.f3307d.f3566e;
                C1202eq eqVar = (C1202eq) emVar;
                if (!eqVar.f3531e && !eqVar.f3530d && (a = emVar.mo4017a()) != null) {
                    C1198em emVar2 = bhVar.f3307d.f3566e;
                    Image d = a.mo4304d();
                    ImageWriter imageWriter = ((C1202eq) emVar2).f3536j;
                    if (!(imageWriter == null || d == null)) {
                        try {
                            imageWriter.queueInputImage(d);
                            cVar = C1390q.m3808a(a.mo4305e());
                        } catch (IllegalStateException e) {
                            C1477bw.m3980c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                }
            }
            if (cVar != null) {
                anVar.f3745f = cVar;
            } else {
                if (bhVar.f3305b != 3 || bhVar.f3309f) {
                    int i3 = apVar.f3751e;
                    i = (i3 == -1 || i3 == 5) ? 2 : -1;
                } else {
                    i = 4;
                }
                if (i != -1) {
                    anVar.f3742c = i;
                }
            }
            C1051i iVar = bhVar.f3308e;
            if (iVar.f3182b && i2 == 0 && iVar.f3181a) {
                C0988a aVar = new C0988a();
                aVar.mo3739d(CaptureRequest.CONTROL_AE_MODE, 3);
                anVar.mo4161e(aVar.mo3736a());
            }
            arrayList.add(C2169h.m6027a(new C1102ay(anVar)));
            arrayList2.add(anVar.mo4157a());
        }
        bhVar.f3307d.f3570i.mo3798a(arrayList2);
        return C1263l.m3429a(arrayList);
    }
}
