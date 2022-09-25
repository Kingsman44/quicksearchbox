package androidx.camera.core.p069a;

import com.evernote.android.state.BuildConfig;
import java.util.List;

/* renamed from: androidx.camera.core.a.g */
/* compiled from: PG */
final class C1380g extends C1354cn {

    /* renamed from: a */
    public C1314ba f3886a;

    /* renamed from: b */
    public List f3887b;

    /* renamed from: c */
    public Integer f3888c;

    /* renamed from: a */
    public final C1355co mo4234a() {
        String str = this.f3886a == null ? " surface" : BuildConfig.FLAVOR;
        if (this.f3887b == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (this.f3888c == null) {
            str = str.concat(" surfaceGroupId");
        }
        if (str.isEmpty()) {
            return new C1381h(this.f3886a, this.f3887b, this.f3888c.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
