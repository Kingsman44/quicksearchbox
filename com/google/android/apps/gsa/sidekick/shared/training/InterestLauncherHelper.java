package com.google.android.apps.gsa.sidekick.shared.training;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.monet.p7070b.p7080ag.p7081a.C90209a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90332a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.p489g.C9290h;
import com.google.android.apps.p489g.C9291i;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;

/* compiled from: PG */
public final class InterestLauncherHelper {

    /* compiled from: PG */
    public class Options implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C91922b();

        /* renamed from: a */
        public String f256343a;

        /* renamed from: b */
        public int f256344b = -1;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f256343a);
            parcel.writeInt(this.f256344b);
        }
    }

    /* renamed from: a */
    public static final Intent m150800a(Options options) {
        C9290h hVar = (C9290h) C9291i.f32254d.createBuilder();
        String str = options.f256343a;
        if (str != null) {
            hVar.copyOnWrite();
            C9291i iVar = (C9291i) hVar.instance;
            iVar.f32256a |= 1;
            iVar.f32257b = str;
        }
        int i = options.f256344b;
        hVar.copyOnWrite();
        C9291i iVar2 = (C9291i) hVar.instance;
        iVar2.f32256a |= 2;
        iVar2.f32258c = i;
        Intent a = C90334c.m146886a(C90332a.NOW_STREAM.f252281i, C90209a.f252000a, C23245b.m43556a((C9291i) hVar.build()));
        a.putExtra("options", options).addFlags(276824064);
        return a;
    }
}
