package com.google.android.apps.search.googleapp.discover.streamui.p10226b;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.discover.streamui.C134749h;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134758i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.b.a */
/* compiled from: PG */
final class C134700a extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ Fragment f366818a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134700a(Fragment fragment) {
        super(0);
        this.f366818a = fragment;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        Bundle arguments = this.f366818a.getArguments();
        if (arguments == null) {
            throw new IllegalStateException("The fragment did not have any arguments");
        } else if (arguments.containsKey("fragment_arg_key")) {
            MessageLite c = ProtoParsers.m95520c(arguments, "fragment_arg_key", C134749h.f366906k, C62921ba.m95368a());
            C69664n.m101060f(c, "get(\n        this,\n     …neratedRegistry()\n      )");
            return C134758i.m218593a((C134749h) c);
        } else {
            throw new IllegalArgumentException("The fragment did not have an argument for fragment_arg_key");
        }
    }
}
