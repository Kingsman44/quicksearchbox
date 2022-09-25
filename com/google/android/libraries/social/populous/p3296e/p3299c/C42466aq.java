package com.google.android.libraries.social.populous.p3296e.p3299c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import com.google.p4181bi.C55809as;
import com.google.p4181bi.C55810at;
import com.google.p4181bi.C55814ax;
import com.google.p4181bi.C55815ay;
import com.google.p4181bi.C55829bb;
import com.google.p4181bi.C55832be;
import com.google.p4181bi.C55845g;
import com.google.p4181bi.C55847i;
import com.google.p4181bi.C55854p;
import com.google.p4181bi.C55856r;
import com.google.p4181bi.C55857s;
import com.google.p4181bi.C55858t;
import com.google.p4181bi.C55859u;
import com.google.p4181bi.C55864z;

/* renamed from: com.google.android.libraries.social.populous.e.c.aq */
/* compiled from: PG */
public final /* synthetic */ class C42466aq implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C42466aq f111394a = new C42466aq();

    private /* synthetic */ C42466aq() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        C58480gp e = C58485gu.m89837e();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                String asString = contentValues.getAsString("display_name");
                String asString2 = contentValues.getAsString("photo_thumb_uri");
                String g = C58837ba.m90858g(contentValues.getAsString("data1"));
                C55857s sVar = (C55857s) C55858t.f147392f.createBuilder();
                sVar.copyOnWrite();
                C55858t tVar = (C55858t) sVar.instance;
                tVar.f147394a |= 8;
                tVar.f147398e = true;
                if (!C58837ba.m90859h(asString)) {
                    C55809as asVar = (C55809as) C55810at.f147265f.createBuilder();
                    asVar.copyOnWrite();
                    C55810at atVar2 = (C55810at) asVar.instance;
                    asString.getClass();
                    atVar2.f147267a |= 1;
                    atVar2.f147268b = asString;
                    sVar.copyOnWrite();
                    C55858t tVar2 = (C55858t) sVar.instance;
                    C55810at atVar3 = (C55810at) asVar.build();
                    atVar3.getClass();
                    tVar2.f147396c = atVar3;
                    tVar2.f147394a |= 2;
                }
                if (!C58837ba.m90859h(asString2)) {
                    C55829bb bbVar = (C55829bb) C55832be.f147328e.createBuilder();
                    bbVar.copyOnWrite();
                    C55832be beVar = (C55832be) bbVar.instance;
                    beVar.f147332c = 3;
                    beVar.f147330a |= 2;
                    bbVar.copyOnWrite();
                    C55832be beVar2 = (C55832be) bbVar.instance;
                    asString2.getClass();
                    beVar2.f147330a |= 1;
                    beVar2.f147331b = asString2;
                    sVar.copyOnWrite();
                    C55858t tVar3 = (C55858t) sVar.instance;
                    C55832be beVar3 = (C55832be) bbVar.build();
                    beVar3.getClass();
                    tVar3.f147395b = beVar3;
                    tVar3.f147394a |= 1;
                }
                C55845g gVar = (C55845g) C55847i.f147358c.createBuilder();
                C55814ax axVar = (C55814ax) C55815ay.f147275f.createBuilder();
                C55854p pVar = (C55854p) C55856r.f147380k.createBuilder();
                pVar.copyOnWrite();
                C55856r rVar = (C55856r) pVar.instance;
                C55858t tVar4 = (C55858t) sVar.build();
                tVar4.getClass();
                rVar.f147385d = tVar4;
                rVar.f147382a |= 1;
                pVar.copyOnWrite();
                C55856r rVar2 = (C55856r) pVar.instance;
                rVar2.f147382a |= 64;
                rVar2.f147389h = false;
                C55859u uVar = (C55859u) C55864z.f147406f.createBuilder();
                uVar.copyOnWrite();
                C55864z zVar = (C55864z) uVar.instance;
                zVar.f147408a |= 1;
                zVar.f147409b = g;
                pVar.copyOnWrite();
                C55856r rVar3 = (C55856r) pVar.instance;
                C55864z zVar2 = (C55864z) uVar.build();
                zVar2.getClass();
                rVar3.f147384c = zVar2;
                rVar3.f147383b = 2;
                axVar.mo54278a(pVar);
                gVar.copyOnWrite();
                C55847i iVar = (C55847i) gVar.instance;
                C55815ay ayVar = (C55815ay) axVar.build();
                ayVar.getClass();
                iVar.f147361b = ayVar;
                iVar.f147360a = 1;
                e.mo55395g((C55847i) gVar.build());
            }
        }
        return e.mo55394f();
    }
}
