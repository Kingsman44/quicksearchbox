package com.google.android.libraries.assistant.trainingcache.p1615a.p1616a;

import com.google.protobuf.C63088z;
import java.io.File;

/* renamed from: com.google.android.libraries.assistant.trainingcache.a.a.e */
/* compiled from: PG */
public final class C19401e extends C19413q {

    /* renamed from: a */
    public String f54277a;

    /* renamed from: b */
    public C63088z f54278b;

    /* renamed from: c */
    public Object f54279c;

    /* renamed from: d */
    private int f54280d;

    /* renamed from: e */
    private File f54281e;

    /* renamed from: f */
    private File f54282f;

    /* renamed from: g */
    private File f54283g;

    /* renamed from: h */
    private byte f54284h;

    /* renamed from: a */
    public final C19414r mo24560a() {
        String str;
        File file;
        File file2;
        File file3;
        if (this.f54284h == 1 && (str = this.f54277a) != null && (file = this.f54281e) != null && (file2 = this.f54282f) != null && (file3 = this.f54283g) != null) {
            return new C19402f(str, this.f54280d, file, file2, file3, this.f54278b, this.f54279c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f54277a == null) {
            sb.append(" sessionName");
        }
        if (this.f54284h == 0) {
            sb.append(" sessionJobId");
        }
        if (this.f54281e == null) {
            sb.append(" inputDirectory");
        }
        if (this.f54282f == null) {
            sb.append(" outputDirectory");
        }
        if (this.f54283g == null) {
            sb.append(" lcPlanFile");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo24561b(File file) {
        if (file != null) {
            this.f54281e = file;
            return;
        }
        throw new NullPointerException("Null inputDirectory");
    }

    /* renamed from: c */
    public final void mo24562c(File file) {
        if (file != null) {
            this.f54283g = file;
            return;
        }
        throw new NullPointerException("Null lcPlanFile");
    }

    /* renamed from: d */
    public final void mo24563d(File file) {
        if (file != null) {
            this.f54282f = file;
            return;
        }
        throw new NullPointerException("Null outputDirectory");
    }

    /* renamed from: e */
    public final void mo24564e(int i) {
        this.f54280d = i;
        this.f54284h = 1;
    }
}
