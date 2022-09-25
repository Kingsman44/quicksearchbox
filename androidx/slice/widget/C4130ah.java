package androidx.slice.widget;

import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.p194a.C4101h;
import java.util.Arrays;

/* renamed from: androidx.slice.widget.ah */
/* compiled from: PG */
public class C4130ah {

    /* renamed from: m */
    public SliceItem f13268m;

    /* renamed from: n */
    protected SliceItem f13269n;

    /* renamed from: o */
    protected SliceItem f13270o;

    /* renamed from: p */
    protected SliceItem f13271p;

    /* renamed from: q */
    protected int f13272q;

    public C4130ah(Slice slice) {
        if (slice != null) {
            m11857b(new SliceItem((Object) slice, "slice", (String) null, Arrays.asList(slice.f13089e)));
            this.f13272q = -1;
        }
    }

    /* renamed from: b */
    private final void m11857b(SliceItem sliceItem) {
        this.f13268m = sliceItem;
        if ("slice".equals(sliceItem.f13092b) || "action".equals(sliceItem.f13092b)) {
            this.f13269n = C4101h.m11760m(sliceItem.mo8596d(), "int", "color", (String[]) null);
            this.f13270o = C4101h.m11760m(sliceItem.mo8596d(), "int", "layout_direction", (String[]) null);
        }
        this.f13271p = C4101h.m11751d(sliceItem, "text", "content_description");
    }

    /* renamed from: a */
    public int mo8710a(C4137ao aoVar, C4143au auVar) {
        return 0;
    }

    /* renamed from: d */
    public boolean mo8711d() {
        return this.f13268m != null;
    }

    /* renamed from: g */
    public final int mo8712g() {
        SliceItem sliceItem = this.f13270o;
        if (sliceItem == null) {
            return -1;
        }
        int a = sliceItem.mo8593a();
        if (a == 2 || a == 3 || a == 1) {
            return a;
        }
        return a == 0 ? 0 : -1;
    }

    /* renamed from: h */
    public final CharSequence mo8713h() {
        SliceItem sliceItem = this.f13271p;
        if (sliceItem != null) {
            return (CharSequence) sliceItem.f13094d;
        }
        return null;
    }

    public C4130ah(SliceItem sliceItem, int i) {
        if (sliceItem != null) {
            m11857b(sliceItem);
            this.f13272q = i;
        }
    }
}
