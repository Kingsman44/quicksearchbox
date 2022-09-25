package androidx.appsearch.p047a;

import android.os.Bundle;
import androidx.appsearch.p053e.C0881b;
import androidx.core.p097i.C1968c;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.appsearch.a.r */
/* compiled from: PG */
public final class C0853r {

    /* renamed from: a */
    private final Bundle f2839a;

    public C0853r(Bundle bundle) {
        this.f2839a = bundle;
    }

    /* renamed from: a */
    public final String mo3417a() {
        return this.f2839a.getString("schemaType", BuildConfig.FLAVOR);
    }

    /* renamed from: b */
    public final List mo3418b() {
        Object obj;
        ArrayList parcelableArrayList = this.f2839a.getParcelableArrayList("properties");
        if (parcelableArrayList.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(parcelableArrayList.size());
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            Bundle bundle = (Bundle) parcelableArrayList.get(i);
            switch (bundle.getInt("dataType")) {
                case 1:
                    obj = new C0852q(bundle);
                    break;
                case 2:
                    obj = new C0849n(bundle);
                    break;
                case 3:
                    obj = new C0847l(bundle);
                    break;
                case 4:
                    obj = new C0841f(bundle);
                    break;
                case 5:
                    obj = new C0844i(bundle);
                    break;
                case 6:
                    obj = new C0846k(bundle);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported property bundle of type " + bundle.getInt("dataType") + "; contents: " + bundle);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0853r)) {
            return false;
        }
        C0853r rVar = (C0853r) obj;
        if (!mo3417a().equals(rVar.mo3417a())) {
            return false;
        }
        return mo3418b().equals(rVar.mo3418b());
    }

    public final int hashCode() {
        return C1968c.m5304a(mo3417a(), mo3418b());
    }

    public final String toString() {
        C0881b bVar = new C0881b();
        bVar.mo3490a("{\n");
        bVar.mo3492c();
        bVar.mo3490a("schemaType: \"");
        bVar.mo3490a(mo3417a());
        bVar.mo3490a("\",\n");
        bVar.mo3490a("properties: [\n");
        int i = 0;
        C0850o[] oVarArr = (C0850o[]) mo3418b().toArray(new C0850o[0]);
        Arrays.sort(oVarArr, C0839d.f2819a);
        while (true) {
            int length = oVarArr.length;
            if (i < length) {
                C0850o oVar = oVarArr[i];
                bVar.mo3492c();
                oVar.mo3408f(bVar);
                if (i != length - 1) {
                    bVar.mo3490a(",\n");
                }
                bVar.mo3491b();
                i++;
            } else {
                bVar.mo3490a("\n");
                bVar.mo3490a("]\n");
                bVar.mo3491b();
                bVar.mo3490a("}");
                return bVar.f2953a.toString();
            }
        }
    }
}
