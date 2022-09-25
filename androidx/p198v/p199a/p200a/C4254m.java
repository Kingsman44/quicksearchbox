package androidx.p198v.p199a.p200a;

import android.graphics.Paint;
import androidx.core.content.p091b.C1855d;

/* renamed from: androidx.v.a.a.m */
/* compiled from: PG */
final class C4254m extends C4257p {

    /* renamed from: a */
    public int[] f13704a;

    /* renamed from: b */
    C1855d f13705b;

    /* renamed from: c */
    float f13706c = 0.0f;

    /* renamed from: d */
    C1855d f13707d;

    /* renamed from: e */
    float f13708e = 1.0f;

    /* renamed from: f */
    float f13709f = 1.0f;

    /* renamed from: g */
    float f13710g = 0.0f;

    /* renamed from: h */
    float f13711h = 1.0f;

    /* renamed from: i */
    float f13712i = 0.0f;

    /* renamed from: j */
    Paint.Cap f13713j = Paint.Cap.BUTT;

    /* renamed from: k */
    Paint.Join f13714k = Paint.Join.MITER;

    /* renamed from: l */
    float f13715l = 4.0f;

    public C4254m() {
    }

    /* renamed from: b */
    public final boolean mo9006b() {
        return this.f13707d.mo5035b() || this.f13705b.mo5035b();
    }

    /* renamed from: c */
    public final boolean mo9007c(int[] iArr) {
        return this.f13705b.mo5036c(iArr) | this.f13707d.mo5036c(iArr);
    }

    /* access modifiers changed from: package-private */
    public float getFillAlpha() {
        return this.f13709f;
    }

    /* access modifiers changed from: package-private */
    public int getFillColor() {
        return this.f13707d.f5731b;
    }

    /* access modifiers changed from: package-private */
    public float getStrokeAlpha() {
        return this.f13708e;
    }

    /* access modifiers changed from: package-private */
    public int getStrokeColor() {
        return this.f13705b.f5731b;
    }

    /* access modifiers changed from: package-private */
    public float getStrokeWidth() {
        return this.f13706c;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathEnd() {
        return this.f13711h;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathOffset() {
        return this.f13712i;
    }

    /* access modifiers changed from: package-private */
    public float getTrimPathStart() {
        return this.f13710g;
    }

    /* access modifiers changed from: package-private */
    public void setFillAlpha(float f) {
        this.f13709f = f;
    }

    /* access modifiers changed from: package-private */
    public void setFillColor(int i) {
        this.f13707d.f5731b = i;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeAlpha(float f) {
        this.f13708e = f;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeColor(int i) {
        this.f13705b.f5731b = i;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeWidth(float f) {
        this.f13706c = f;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathEnd(float f) {
        this.f13711h = f;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathOffset(float f) {
        this.f13712i = f;
    }

    /* access modifiers changed from: package-private */
    public void setTrimPathStart(float f) {
        this.f13710g = f;
    }

    public C4254m(C4254m mVar) {
        super(mVar);
        int[] iArr = mVar.f13704a;
        this.f13704a = null;
        this.f13705b = mVar.f13705b;
        this.f13706c = mVar.f13706c;
        this.f13708e = mVar.f13708e;
        this.f13707d = mVar.f13707d;
        this.f13731o = mVar.f13731o;
        this.f13709f = mVar.f13709f;
        this.f13710g = mVar.f13710g;
        this.f13711h = mVar.f13711h;
        this.f13712i = mVar.f13712i;
        this.f13713j = mVar.f13713j;
        this.f13714k = mVar.f13714k;
        this.f13715l = mVar.f13715l;
    }
}
