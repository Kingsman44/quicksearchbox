package p5462h.p5472e;

import java.io.File;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.e.g */
/* compiled from: PG */
final class C69603g extends C69600d {

    /* renamed from: b */
    private boolean f186005b;

    /* renamed from: c */
    private File[] f186006c;

    /* renamed from: d */
    private int f186007d;

    public C69603g(File file) {
        super(file);
    }

    /* renamed from: a */
    public final File mo61363a() {
        if (!this.f186005b) {
            this.f186005b = true;
            return this.f186010a;
        }
        File[] fileArr = this.f186006c;
        if (fileArr != null && this.f186007d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            fileArr = this.f186010a.listFiles();
            this.f186006c = fileArr;
            if (fileArr == null || fileArr.length == 0) {
                return null;
            }
        }
        C69664n.m101058d(fileArr);
        int i = this.f186007d;
        this.f186007d = i + 1;
        return fileArr[i];
    }
}
