package androidx.navigation;

import java.util.regex.Pattern;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.navigation.an */
/* compiled from: PG */
final class C3815an extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C3816ao f12323a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3815an(C3816ao aoVar) {
        super(0);
        this.f12323a = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        String str = this.f12323a.f12330f;
        if (str == null) {
            return null;
        }
        return Pattern.compile(str, 2);
    }
}
