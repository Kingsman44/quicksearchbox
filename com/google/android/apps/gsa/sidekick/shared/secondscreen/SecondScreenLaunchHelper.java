package com.google.android.apps.gsa.sidekick.shared.secondscreen;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.gsa.h.f.a.a;
import com.google.android.apps.gsa.h.f.a.c;
import com.google.android.apps.gsa.h.f.a.d;
import com.google.android.apps.gsa.shared.monet.p7116h.C90332a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;
import com.google.android.apps.p489g.p494d.C9224df;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.p375ai.p378b.C7799kj;
import com.google.p375ai.p378b.C7893nw;
import com.google.p375ai.p378b.C7971qt;
import com.google.p375ai.p378b.C8150xj;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class SecondScreenLaunchHelper {

    /* compiled from: PG */
    public class Options implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C91915a();

        /* renamed from: a */
        public C7799kj f256314a;

        /* renamed from: b */
        public String f256315b;

        /* renamed from: c */
        public C8150xj f256316c;

        /* renamed from: d */
        public String f256317d;

        /* renamed from: e */
        public C8150xj f256318e;

        /* renamed from: f */
        public String f256319f;

        /* renamed from: g */
        public String f256320g;

        /* renamed from: h */
        public List f256321h = new ArrayList();

        /* renamed from: i */
        public boolean f256322i = false;

        /* renamed from: j */
        public int f256323j;

        /* renamed from: k */
        public boolean f256324k;

        /* renamed from: l */
        public boolean f256325l;

        /* renamed from: m */
        public boolean f256326m = true;

        /* renamed from: n */
        public boolean f256327n = true;

        /* renamed from: o */
        public boolean f256328o = false;

        /* renamed from: p */
        public boolean f256329p;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f256329p ? 1 : 0);
            ProtoLiteParcelable.m147140k(this.f256314a, parcel);
            parcel.writeString(this.f256315b);
            ProtoLiteParcelable.m147140k(this.f256316c, parcel);
            parcel.writeString(this.f256317d);
            ProtoLiteParcelable.m147140k(this.f256318e, parcel);
            parcel.writeString(this.f256319f);
            ProtoLiteParcelable.m147139j(this.f256321h, parcel);
            parcel.writeInt(this.f256322i ? 1 : 0);
            parcel.writeInt(this.f256323j);
            parcel.writeInt(this.f256325l ? 1 : 0);
            parcel.writeInt(this.f256326m ? 1 : 0);
            parcel.writeInt(this.f256327n ? 1 : 0);
            parcel.writeInt(this.f256328o ? 1 : 0);
            parcel.writeString(this.f256320g);
            parcel.writeInt(this.f256324k ? 1 : 0);
        }
    }

    /* renamed from: a */
    public static final Options m150796a(boolean z, C9224df dfVar) {
        Options options = new Options();
        boolean z2 = !z;
        options.f256322i = z2;
        if ((dfVar.f31881a & 64) != 0) {
            C7799kj kjVar = dfVar.f31889i;
            if (kjVar == null) {
                kjVar = C7799kj.f27263h;
            }
            options.f256314a = kjVar;
        }
        int i = dfVar.f31881a;
        if ((i & 2) != 0) {
            options.f256315b = dfVar.f31883c;
        }
        if ((i & 1) != 0) {
            C7971qt qtVar = dfVar.f31882b;
            if (qtVar == null) {
                qtVar = C7971qt.f27997c;
            }
            if (options.f256315b == null) {
                options.f256315b = qtVar.f28000b;
            }
        }
        if ((dfVar.f31881a & 4) != 0) {
            C8150xj xjVar = dfVar.f31884d;
            if (xjVar == null) {
                xjVar = C8150xj.f28657d;
            }
            options.f256316c = xjVar;
        }
        int i2 = dfVar.f31881a;
        if ((i2 & 8) != 0) {
            options.f256317d = dfVar.f31885e;
        }
        if ((i2 & 16) != 0) {
            C8150xj xjVar2 = dfVar.f31886f;
            if (xjVar2 == null) {
                xjVar2 = C8150xj.f28657d;
            }
            options.f256318e = xjVar2;
        }
        for (C7893nw add : dfVar.f31887g) {
            options.f256321h.add(add);
        }
        if ((dfVar.f31881a & 256) != 0) {
            options.f256319f = dfVar.f31890j;
        }
        options.f256328o = dfVar.f31891k;
        options.f256326m = z2;
        if (dfVar.f31888h) {
            options.f256329p = true;
        }
        return options;
    }

    /* renamed from: b */
    public static final void m150797b(Context context, C91748d dVar, Options options) {
        int i = 1;
        if (TextUtils.isEmpty(options.f256319f)) {
            Bundle bundle = options.f256327n ? ActivityOptions.makeCustomAnimation(context, 0, 0).toBundle() : null;
            c createBuilder = d.r.createBuilder();
            List list = options.f256321h;
            createBuilder.copyOnWrite();
            d dVar2 = createBuilder.instance;
            C62971cq cqVar = dVar2.i;
            if (!cqVar.mo58948c()) {
                dVar2.i = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) dVar2.i);
            boolean z = options.f256322i;
            createBuilder.copyOnWrite();
            d dVar3 = createBuilder.instance;
            dVar3.a |= 128;
            dVar3.j = z;
            int i2 = options.f256323j;
            createBuilder.copyOnWrite();
            d dVar4 = createBuilder.instance;
            dVar4.a |= 256;
            dVar4.k = i2;
            boolean z2 = options.f256325l;
            createBuilder.copyOnWrite();
            d dVar5 = createBuilder.instance;
            dVar5.a |= 512;
            dVar5.l = z2;
            boolean z3 = options.f256324k;
            createBuilder.copyOnWrite();
            d dVar6 = createBuilder.instance;
            dVar6.a |= 16384;
            dVar6.q = z3;
            boolean z4 = options.f256326m;
            createBuilder.copyOnWrite();
            d dVar7 = createBuilder.instance;
            dVar7.a |= 1024;
            dVar7.m = z4;
            boolean z5 = options.f256327n;
            createBuilder.copyOnWrite();
            d dVar8 = createBuilder.instance;
            dVar8.a |= 2048;
            dVar8.n = z5;
            boolean z6 = options.f256328o;
            createBuilder.copyOnWrite();
            d dVar9 = createBuilder.instance;
            dVar9.a |= 4096;
            dVar9.o = z6;
            boolean z7 = options.f256329p;
            createBuilder.copyOnWrite();
            d dVar10 = createBuilder.instance;
            dVar10.a |= 1;
            dVar10.b = z7;
            String str = options.f256315b;
            if (str != null) {
                createBuilder.copyOnWrite();
                d dVar11 = createBuilder.instance;
                dVar11.a |= 4;
                dVar11.d = str;
            }
            C8150xj xjVar = options.f256316c;
            if (xjVar != null) {
                createBuilder.copyOnWrite();
                d dVar12 = createBuilder.instance;
                dVar12.e = xjVar;
                dVar12.a |= 8;
            }
            String str2 = options.f256317d;
            if (str2 != null) {
                createBuilder.copyOnWrite();
                d dVar13 = createBuilder.instance;
                dVar13.a |= 16;
                dVar13.f = str2;
            }
            C8150xj xjVar2 = options.f256318e;
            if (xjVar2 != null) {
                createBuilder.copyOnWrite();
                d dVar14 = createBuilder.instance;
                dVar14.g = xjVar2;
                dVar14.a |= 32;
            }
            String str3 = options.f256320g;
            if (str3 != null) {
                createBuilder.copyOnWrite();
                d dVar15 = createBuilder.instance;
                dVar15.a |= 8192;
                dVar15.p = str3;
            }
            String str4 = options.f256319f;
            if (str4 != null) {
                createBuilder.copyOnWrite();
                d dVar16 = createBuilder.instance;
                dVar16.a |= 64;
                dVar16.h = str4;
            }
            C7799kj kjVar = options.f256314a;
            if (kjVar != null) {
                createBuilder.copyOnWrite();
                d dVar17 = createBuilder.instance;
                dVar17.c = kjVar;
                dVar17.a |= 2;
            }
            Intent a = C90334c.m146886a(C90332a.NOW_STREAM.f252281i, new C23129y("now_stream", "TYPE_SECOND_SCREEN"), C23245b.m43556a(createBuilder.build()));
            a.addFlags(a.a(context, options.f256328o, !options.f256322i));
            if (true == options.f256324k) {
                i = 2;
            }
            a.putExtra("EXTRA_FORCE_LOCAL_NIGHT_MODE", i);
            context.startActivity(a, bundle);
            return;
        }
        dVar.mo86241e(context, Uri.parse(options.f256319f), false, true);
    }
}
