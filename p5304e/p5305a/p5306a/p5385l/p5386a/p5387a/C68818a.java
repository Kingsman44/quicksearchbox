package p5304e.p5305a.p5306a.p5385l.p5386a.p5387a;

import android.util.Base64;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import com.google.speech.p5228m.C67327cd;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.l.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C68818a implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C67327cd cdVar = (C67327cd) C62942bv.parseFrom((C62942bv) C67327cd.f182998h, Base64.decode("EhQNzczMPhUzM8NAHTMzsz4lMzPjQBgAIAApAAAAAAAA4D8xAAAAAAAA0D85AAAAAAAA4D8", 3));
            C58838bb.m90866a(cdVar, "use Optional.orNull() instead of Optional.or(null)");
            return cdVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
