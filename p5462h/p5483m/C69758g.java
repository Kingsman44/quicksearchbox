package p5462h.p5483m;

import com.evernote.android.state.BuildConfig;
import p5462h.p5463a.C69524h;

/* renamed from: h.m.g */
/* compiled from: PG */
public final class C69758g extends C69524h {

    /* renamed from: a */
    final /* synthetic */ C69759h f186133a;

    public C69758g(C69759h hVar) {
        this.f186133a = hVar;
    }

    /* renamed from: a */
    public final int mo61249a() {
        return this.f186133a.f186134a.groupCount() + 1;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.contains((String) obj);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        String group = this.f186133a.f186134a.group(i);
        return group == null ? BuildConfig.FLAVOR : group;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.indexOf((String) obj);
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.lastIndexOf((String) obj);
    }
}
