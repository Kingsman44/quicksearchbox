package com.google.android.libraries.search.assistant.p2822w.p2823a.p2824a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
import com.google.protos.p4985f.p5030q.C65287im;
import com.google.protos.p4985f.p5030q.C65288in;
import com.google.protos.p4985f.p5030q.C65289io;

/* renamed from: com.google.android.libraries.search.assistant.w.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C36778a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C65287im f95841a;

    public /* synthetic */ C36778a(C65287im imVar) {
        this.f95841a = imVar;
    }

    public final C60870cx apply(Object obj) {
        C65287im imVar = this.f95841a;
        C21957e eVar = (C21957e) obj;
        int i = C36780c.f95843a;
        try {
            SQLiteDatabase g = ((C36783d) eVar).mo40395g();
            if (g != null) {
                C65288in inVar = (C65288in) C65289io.f176607b.createBuilder();
                String i2 = C36783d.m65459i(imVar.f176604a);
                C65161dv dvVar = imVar.f176605b;
                if (dvVar == null) {
                    dvVar = C65161dv.f176346e;
                }
                String h = C36783d.m65458h(dvVar);
                Cursor rawQuery = g.rawQuery(String.format("SELECT %s FROM %s WHERE %s in (%s) ", new Object[]{"data", "pp_data", "_id", "SELECT DISTINCT data_id FROM pp_app_intents WHERE package_name IN " + i2 + h}), (String[]) null);
                try {
                    int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("data");
                    while (rawQuery.moveToNext()) {
                        C49362d dVar = (C49362d) C62942bv.parseFrom((C62942bv) C49362d.f127591d, rawQuery.getBlob(columnIndexOrThrow), C62921ba.m95368a());
                        inVar.copyOnWrite();
                        C65289io ioVar = (C65289io) inVar.instance;
                        dVar.getClass();
                        C62971cq cqVar = ioVar.f176609a;
                        if (!cqVar.mo58948c()) {
                            ioVar.f176609a = C62942bv.mutableCopy(cqVar);
                        }
                        ioVar.f176609a.add(dVar);
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return C60856cj.m92900i((C65289io) inVar.build());
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
            return C60856cj.m92899h(e2);
        } catch (Throwable th2) {
            C36782c.m65457a(th, th2);
        }
    }
}
