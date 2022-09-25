package com.google.android.apps.search.assistant.verticals.contextdebug;

import android.util.Base64;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50547o;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.q */
/* compiled from: PG */
public final /* synthetic */ class C132047q implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C132047q f360416a = new C132047q();

    private /* synthetic */ C132047q() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        try {
            return Optional.ofNullable((C50547o) C62942bv.parseFrom((C62942bv) C50547o.f131554e, Base64.decode((String) obj, 0), C62921ba.m95368a()));
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C132052v.f360422a.mo56225c()).mo56382g(e)).mo56372aa(39505)).mo56386p("Error parsing request");
            return Optional.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
