package p5304e.p5305a.p5306a.p5349b.p5350a.p5351a;

import android.util.Base64;
import com.google.android.libraries.mdi.download.C28730bh;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.b.a.a.z */
/* compiled from: PG */
public final /* synthetic */ class C68554z implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C28730bh bhVar = (C28730bh) C62942bv.parseFrom((C62942bv) C28730bh.f78048d, Base64.decode("Ch9zcGVlY2hfY29udGV4dHVhbF9tYW5pZmVzdF9hdXRvEkZodHRwczovL2RsLmdvb2dsZS5jb20vc3BlZWNoLWNvbnRleHR1YWwtbW9kZWxzL21hbmlmZXN0cy9tYW5pZmVzdC1hdXRv", 3));
            C58838bb.m90866a(bhVar, "use Optional.orNull() instead of Optional.or(null)");
            return bhVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
