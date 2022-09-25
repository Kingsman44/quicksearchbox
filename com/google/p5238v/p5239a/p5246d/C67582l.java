package com.google.p5238v.p5239a.p5246d;

import com.google.p5238v.p5239a.C67539aj;
import com.google.p5238v.p5239a.p5240a.C67487a;
import com.google.p5238v.p5239a.p5245c.C67549d;
import com.google.p5238v.p5239a.p5255j.C67653aj;
import com.google.p5238v.p5239a.p5255j.C67655al;
import com.google.p5238v.p5239a.p5255j.C67661ar;
import com.google.p5238v.p5239a.p5255j.C67663at;
import com.google.p5238v.p5239a.p5255j.C67705ch;
import com.google.p5238v.p5239a.p5255j.C67725da;
import com.google.p5238v.p5239a.p5255j.C67768h;
import com.google.p5238v.p5239a.p5255j.C67770j;
import com.google.p5238v.p5239a.p5255j.C67780t;
import com.google.p5238v.p5239a.p5259m.C67891u;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.d.l */
/* compiled from: PG */
public final class C67582l implements C67891u {

    /* renamed from: a */
    public final String f183502a;

    /* renamed from: b */
    public final int f183503b;

    /* renamed from: c */
    public C67653aj f183504c;

    /* renamed from: d */
    public C67768h f183505d;

    /* renamed from: e */
    public int f183506e;

    /* renamed from: f */
    public C67661ar f183507f;

    public C67582l(C67725da daVar) {
        String str = daVar.f183751a;
        this.f183502a = str;
        if (str.equals(C67487a.f183423b)) {
            try {
                C63088z zVar = daVar.f183752b;
                C62921ba baVar = C62921ba.f169869a;
                this.f183504c = (C67653aj) C67539aj.m97628c(daVar);
                this.f183503b = ((C67655al) C62942bv.parseFrom((C62942bv) C67655al.f183612b, zVar, baVar)).f183614a;
            } catch (C62974ct e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (str.equals(C67487a.f183422a)) {
            try {
                C67770j jVar = (C67770j) C62942bv.parseFrom((C62942bv) C67770j.f183863c, daVar.f183752b, C62921ba.f169869a);
                this.f183505d = (C67768h) C67539aj.m97628c(daVar);
                C67780t tVar = jVar.f183865a;
                this.f183506e = (tVar == null ? C67780t.f183887c : tVar).f183890b;
                C67705ch chVar = jVar.f183866b;
                this.f183503b = this.f183506e + (chVar == null ? C67705ch.f183706c : chVar).f183709b;
            } catch (C62974ct e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (str.equals(C67549d.f183463a)) {
            try {
                C63088z zVar2 = daVar.f183752b;
                C62921ba baVar2 = C62921ba.f169869a;
                this.f183507f = (C67661ar) C67539aj.m97628c(daVar);
                this.f183503b = ((C67663at) C62942bv.parseFrom((C62942bv) C67663at.f183626b, zVar2, baVar2)).f183628a;
            } catch (C62974ct e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(str)));
        }
    }
}
