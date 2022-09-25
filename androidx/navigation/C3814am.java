package androidx.navigation;

import java.util.regex.Pattern;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.navigation.am */
/* compiled from: PG */
final class C3814am extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C3816ao f12322a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3814am(C3816ao aoVar) {
        super(0);
        this.f12322a = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        String str = this.f12322a.f12333i;
        if (str == null) {
            return null;
        }
        return Pattern.compile(str);
    }
}
