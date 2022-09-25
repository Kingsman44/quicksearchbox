package androidx.constraintlayout.p079a.p082b;

import androidx.constraintlayout.p079a.p082b.p083a.C1625j;
import androidx.constraintlayout.p079a.p082b.p083a.C1632q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.a.b.k */
/* compiled from: PG */
public class C1643k extends C1638f {

    /* renamed from: be */
    public C1638f[] f4742be = new C1638f[4];

    /* renamed from: bf */
    public int f4743bf = 0;

    /* renamed from: Q */
    public final void mo4665Q(C1638f fVar) {
        if (fVar != this && fVar != null) {
            int i = this.f4743bf;
            C1638f[] fVarArr = this.f4742be;
            int length = fVarArr.length;
            if (i + 1 > length) {
                this.f4742be = (C1638f[]) Arrays.copyOf(fVarArr, length + length);
            }
            C1638f[] fVarArr2 = this.f4742be;
            int i2 = this.f4743bf;
            fVarArr2[i2] = fVar;
            this.f4743bf = i2 + 1;
        }
    }

    /* renamed from: R */
    public final void mo4666R(ArrayList arrayList, int i, C1632q qVar) {
        for (int i2 = 0; i2 < this.f4743bf; i2++) {
            qVar.mo4595d(this.f4742be[i2]);
        }
        for (int i3 = 0; i3 < this.f4743bf; i3++) {
            C1625j.m4343a(this.f4742be[i3], i, arrayList, qVar);
        }
    }

    /* renamed from: S */
    public final void mo4667S() {
        this.f4743bf = 0;
        Arrays.fill(this.f4742be, (Object) null);
    }

    /* renamed from: T */
    public void mo4668T() {
    }

    /* renamed from: c */
    public void mo4561c(C1638f fVar, HashMap hashMap) {
        super.mo4561c(fVar, hashMap);
        C1643k kVar = (C1643k) fVar;
        this.f4743bf = 0;
        int i = kVar.f4743bf;
        for (int i2 = 0; i2 < i; i2++) {
            mo4665Q((C1638f) hashMap.get(kVar.f4742be[i2]));
        }
    }
}
