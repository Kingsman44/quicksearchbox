package com.google.android.libraries.search.assistant.p2822w.p2823a.p2824a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.geller.portable.database.C21957e;
import com.google.android.libraries.search.assistant.p2822w.p2823a.C36782c;
import com.google.android.libraries.search.assistant.p2822w.p2823a.C36783d;
import com.google.assistant.p3825an.p3834e.p3835a.C49362d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protos.p4985f.p5030q.C65161dv;
import com.google.protos.p4985f.p5030q.C65283ii;
import com.google.protos.p4985f.p5030q.C65284ij;
import com.google.protos.p4985f.p5030q.C65285ik;

/* renamed from: com.google.android.libraries.search.assistant.w.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C36779b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C65283ii f95842a;

    public /* synthetic */ C36779b(C65283ii iiVar) {
        this.f95842a = iiVar;
    }

    public final C60870cx apply(Object obj) {
        C65283ii iiVar = this.f95842a;
        C21957e eVar = (C21957e) obj;
        int i = C36780c.f95843a;
        try {
            SQLiteDatabase g = ((C36783d) eVar).mo40395g();
            if (g != null) {
                C65284ij ijVar = (C65284ij) C65285ik.f176599b.createBuilder();
                String i2 = C36783d.m65459i(iiVar.f176595a);
                String concat = iiVar.f176597c.size() > 0 ? " AND provider_id IN ".concat(C36783d.m65459i(iiVar.f176597c)) : BuildConfig.FLAVOR;
                C65161dv dvVar = iiVar.f176596b;
                if (dvVar == null) {
                    dvVar = C65161dv.f176346e;
                }
                String h = C36783d.m65458h(dvVar);
                Cursor rawQuery = g.rawQuery(String.format("SELECT %s FROM %s WHERE %s IN (%s) ", new Object[]{"data", "pp_data", "_id", "SELECT data_id FROM pp_app_intents WHERE intent IN " + i2 + concat + h}), (String[]) null);
                try {
                    int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("data");
                    while (rawQuery.moveToNext()) {
                        C49362d dVar = (C49362d) C62942bv.parseFrom((C62942bv) C49362d.f127591d, rawQuery.getBlob(columnIndexOrThrow), C62921ba.m95368a());
                        ijVar.copyOnWrite();
                        C65285ik ikVar = (C65285ik) ijVar.instance;
                        dVar.getClass();
                        C62971cq cqVar = ikVar.f176601a;
                        if (!cqVar.mo58948c()) {
                            ikVar.f176601a = C62942bv.mutableCopy(cqVar);
                        }
                        ikVar.f176601a.add(dVar);
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return C60856cj.m92900i((C65285ik) ijVar.build());
                } catch (C62974ct e) {
                    throw new IllegalStateException("Failed to parse the portable provider.", e);
                } catch (Throwable th) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            } else {
                throw new Exception("Can't get a Portable provider database");
            }
        } catch (Exception e2) {
            return C60856cj.m92899h(new Exception(e2.getMessage()));
        } catch (Throwable th2) {
            C36782c.m65457a(th, th2);
        }
    }
}
