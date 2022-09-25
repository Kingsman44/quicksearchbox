package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6243v.C79360j;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.p5220b.p5221a.C66802f;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.q */
/* compiled from: PG */
public final class C77812q extends C79360j {

    /* renamed from: a */
    public static final C58974d f214350a = C58974d.m91136j();

    /* renamed from: b */
    public final C91142g f214351b;

    /* renamed from: c */
    public C66802f f214352c = C66802f.f181666b;

    /* renamed from: d */
    private final Context f214353d;

    /* renamed from: e */
    private final C22871g f214354e;

    public C77812q(Context context, C22871g gVar, C91142g gVar2, C76092h hVar, C79359i iVar) {
        super(iVar, hVar);
        this.f214353d = context;
        this.f214354e = gVar;
        this.f214351b = gVar2;
    }

    /* renamed from: d */
    private final C66802f m124824d() {
        C66802f fVar = C66802f.f181666b;
        try {
            try {
                return (C66802f) C62942bv.parseFrom((C62942bv) C66802f.f181666b, this.f214353d.getResources().openRawResource(R.raw.fuzzy_fix_config_pb));
            } catch (IOException e) {
                ((C58970a) ((C58970a) ((C58970a) f214350a.mo56226d()).mo56382g(e)).mo56372aa(4421)).mo56386p("Converting from input stream to FuzzyFixConfig caused an exception.");
                return fVar;
            }
        } catch (Resources.NotFoundException e2) {
            ((C58970a) ((C58970a) ((C58970a) f214350a.mo56226d()).mo56382g(e2)).mo56372aa(4422)).mo56386p("Fuzzy fix config resource not found.");
            return fVar;
        }
    }

    /* renamed from: b */
    public final synchronized void mo72832b() {
        if (this.f214352c.equals(C66802f.f181666b)) {
            this.f214352c = m124824d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        return this.f214354e.mo28201a("[NGA] FuzzyFixConfigHandler.onNgaCreate", new C77811p(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "FuzzyFixConfigHandler";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 40;
    }
}
