package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.p069a.C1324bk;
import androidx.camera.core.p069a.C1352cl;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.core.bc */
/* compiled from: PG */
public final /* synthetic */ class C1457bc implements C1352cl {

    /* renamed from: a */
    public final /* synthetic */ C1470bp f4031a;

    /* renamed from: b */
    public final /* synthetic */ String f4032b;

    /* renamed from: c */
    public final /* synthetic */ C1324bk f4033c;

    /* renamed from: d */
    public final /* synthetic */ Size f4034d;

    public /* synthetic */ C1457bc(C1470bp bpVar, String str, C1324bk bkVar, Size size) {
        this.f4031a = bpVar;
        this.f4032b = str;
        this.f4033c = bkVar;
        this.f4034d = size;
    }

    /* renamed from: a */
    public final void mo4233a() {
        List<C1466bl> list;
        C60870cx cxVar;
        C1470bp bpVar = this.f4031a;
        String str = this.f4032b;
        C1324bk bkVar = this.f4033c;
        Size size = this.f4034d;
        C1469bo boVar = bpVar.f4070n;
        if (boVar != null) {
            synchronized (boVar.f4049e) {
                list = new ArrayList<>(boVar.f4045a);
                boVar.f4045a.clear();
                C1466bl blVar = boVar.f4046b;
                boVar.f4046b = null;
                if (!(blVar == null || (cxVar = boVar.f4047c) == null || !cxVar.cancel(true))) {
                    list.add(0, blVar);
                }
            }
        } else {
            list = Collections.emptyList();
        }
        bpVar.mo4354j();
        if (bpVar.mo4423y(str)) {
            bpVar.f4065i = bpVar.mo4353i(str, bkVar, size);
            if (bpVar.f4070n != null) {
                for (C1466bl blVar2 : list) {
                    C1469bo boVar2 = bpVar.f4070n;
                    synchronized (boVar2.f4049e) {
                        boVar2.f4045a.offer(blVar2);
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[2];
                        objArr[0] = Integer.valueOf(boVar2.f4046b != null ? 1 : 0);
                        objArr[1] = Integer.valueOf(boVar2.f4045a.size());
                        C1477bw.m3978a("ImageCapture", String.format(locale, "Send image capture request [current, pending] = [%d, %d]", objArr));
                        boVar2.mo4350b();
                    }
                }
            }
            bpVar.mo4422x(bpVar.f4065i.mo4227b());
            bpVar.mo4420v();
        }
    }
}
