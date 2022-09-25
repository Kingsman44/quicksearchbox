package com.google.android.libraries.search.assistant.p2828y.p2853n;

import android.util.Base64;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2846a.C36954b;
import com.google.assistant.p3897e.p3917i.p3918a.C51442hw;
import com.google.assistant.p3897e.p3917i.p3918a.C51443hx;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.y.n.d */
/* compiled from: PG */
public final /* synthetic */ class C37007d implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C37007d f96375a = new C37007d();

    private /* synthetic */ C37007d() {
    }

    public final Object apply(Object obj) {
        C36954b bVar = (C36954b) obj;
        String str = bVar.f96230b;
        if (str.isEmpty()) {
            return Optional.empty();
        }
        Duration ofMillis = Duration.ofMillis(bVar.f96231c);
        if (ofMillis.isZero()) {
            return Optional.empty();
        }
        try {
            C52428rj rjVar = (C52428rj) C62942bv.parseFrom((C62942bv) C52428rj.f137558m, Base64.decode(str, 0), C62921ba.m95368a());
            C51442hw hwVar = (C51442hw) C51443hx.f133974d.createBuilder();
            hwVar.copyOnWrite();
            C51443hx hxVar = (C51443hx) hwVar.instance;
            rjVar.getClass();
            hxVar.f133977b = rjVar;
            hxVar.f133976a |= 1;
            long millis = ofMillis.toMillis();
            hwVar.copyOnWrite();
            C51443hx hxVar2 = (C51443hx) hwVar.instance;
            hxVar2.f133976a |= 2;
            hxVar2.f133978c = millis;
            return Optional.m71637of((C51443hx) hwVar.build());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C37015l.f96387a.mo56225c()).mo56382g(e)).mo56372aa(52485)).mo56389s("Failed to parse DeviceId from stored device id %s", str);
            return Optional.empty();
        }
    }
}
