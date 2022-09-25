package com.google.android.apps.gsa.opa.smartspace.p6453b;

import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83737ai;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3994s.p3995a.C53178eg;
import com.google.assistant.p3994s.p3995a.C53179eh;
import com.google.assistant.p3994s.p3995a.C53180ei;
import com.google.assistant.p3994s.p3995a.C53182ek;
import com.google.assistant.p3994s.p3995a.C53183el;
import com.google.assistant.p3994s.p3995a.C53186eo;
import com.google.assistant.p3994s.p3995a.C53187ep;
import com.google.assistant.p3994s.p3995a.C53190es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import com.google.protos.p4953bc.p4954a.C64406j;
import com.google.protos.p4953bc.p4954a.C64408l;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64417h;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64419j;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64422m;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64423n;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64429t;
import com.google.protos.p4953bc.p4955b.p4956a.p4957a.C64431v;
import java.util.concurrent.TimeUnit;
import p3186j$.time.OffsetDateTime;
import p3186j$.time.format.DateTimeParseException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.b.a */
/* compiled from: PG */
public final class C83743a {

    /* renamed from: a */
    public static final long f228263a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: b */
    public static final C58528ij f228264b = C58528ij.m90014N(C64406j.CANCELLED, C64406j.NOT_OPERATIONAL, C64406j.NO_VALUE, C64406j.UNKNOWN, C64406j.UNRECOGNIZED);

    /* renamed from: c */
    public static final C58528ij f228265c = C58528ij.m90011K(C64431v.CANCELED_CASE, C64431v.UNKNOWN_CASE);

    /* renamed from: d */
    public static final C59071e f228266d = C59071e.m91332i("com.google.android.apps.gsa.opa.smartspace.b.a");

    /* renamed from: g */
    private static final long f228267g = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: e */
    public final C21370a f228268e;

    /* renamed from: f */
    public final SharedPreferences f228269f;

    /* renamed from: h */
    private final C86124t f228270h;

    public C83743a(C21370a aVar, SharedPreferences sharedPreferences, C86124t tVar) {
        this.f228268e = aVar;
        this.f228269f = sharedPreferences;
        this.f228270h = tVar;
    }

    /* renamed from: a */
    public static C58485gu m133332a(C57017i iVar) {
        Optional optional;
        C57017i iVar2 = iVar;
        int i = iVar2.f152207b;
        if (i == 19) {
            C64429t tVar = (C64429t) iVar2.f152208c;
            if ((tVar.f174761a & 8192) != 0) {
                C64417h hVar = tVar.f174763c;
                if (hVar == null) {
                    hVar = C64417h.f174725c;
                }
                C53180ei eiVar = (C53180ei) C53190es.f139393s.createBuilder();
                C53178eg egVar = (C53178eg) C53179eh.f139366e.createBuilder();
                String str = hVar.f174727a;
                egVar.copyOnWrite();
                C53179eh ehVar = (C53179eh) egVar.instance;
                str.getClass();
                ehVar.f139368a |= 1;
                ehVar.f139369b = str;
                String str2 = hVar.f174727a;
                egVar.copyOnWrite();
                C53179eh ehVar2 = (C53179eh) egVar.instance;
                str2.getClass();
                ehVar2.f139368a |= 2;
                ehVar2.f139370c = str2;
                eiVar.copyOnWrite();
                C53190es esVar = (C53190es) eiVar.instance;
                C53179eh ehVar3 = (C53179eh) egVar.build();
                ehVar3.getClass();
                esVar.f139405j = ehVar3;
                esVar.f139396a |= 256;
                try {
                    int parseInt = Integer.parseInt(hVar.f174728b);
                    eiVar.copyOnWrite();
                    C53190es esVar2 = (C53190es) eiVar.instance;
                    esVar2.f139396a |= 512;
                    esVar2.f139406k = parseInt;
                    C64423n nVar = tVar.f174762b;
                    if (nVar == null) {
                        nVar = C64423n.f174740m;
                    }
                    int i2 = 16;
                    if ((nVar.f174742a & 16) != 0) {
                        C64422m mVar = nVar.f174749h;
                        if (mVar == null) {
                            mVar = C64422m.f174736b;
                        }
                        C53182ek d = m133334d(mVar);
                        eiVar.copyOnWrite();
                        C53190es esVar3 = (C53190es) eiVar.instance;
                        C53183el elVar = (C53183el) d.build();
                        elVar.getClass();
                        esVar3.f139403h = elVar;
                        esVar3.f139396a |= 4;
                    }
                    int i3 = nVar.f174743b;
                    if (i3 == 8) {
                        C53182ek d2 = m133334d((C64422m) nVar.f174744c);
                        eiVar.copyOnWrite();
                        C53190es esVar4 = (C53190es) eiVar.instance;
                        C53183el elVar2 = (C53183el) d2.build();
                        elVar2.getClass();
                        esVar4.f139398c = elVar2;
                        esVar4.f139397b = 11;
                    } else if (i3 == 7) {
                        C53182ek d3 = m133334d((C64422m) nVar.f174744c);
                        eiVar.copyOnWrite();
                        C53190es esVar5 = (C53190es) eiVar.instance;
                        C53183el elVar3 = (C53183el) d3.build();
                        elVar3.getClass();
                        esVar5.f139398c = elVar3;
                        esVar5.f139397b = 10;
                    }
                    if ((nVar.f174742a & 128) != 0) {
                        C64422m mVar2 = nVar.f174750i;
                        if (mVar2 == null) {
                            mVar2 = C64422m.f174736b;
                        }
                        C53182ek d4 = m133334d(mVar2);
                        eiVar.copyOnWrite();
                        C53190es esVar6 = (C53190es) eiVar.instance;
                        C53183el elVar4 = (C53183el) d4.build();
                        elVar4.getClass();
                        esVar6.f139404i = elVar4;
                        esVar6.f139396a |= 32;
                    }
                    int i4 = nVar.f174745d;
                    if (i4 == 11) {
                        C53182ek d5 = m133334d((C64422m) nVar.f174746e);
                        eiVar.copyOnWrite();
                        C53190es esVar7 = (C53190es) eiVar.instance;
                        C53183el elVar5 = (C53183el) d5.build();
                        elVar5.getClass();
                        esVar7.f139400e = elVar5;
                        esVar7.f139399d = 14;
                    } else if (i4 == 10) {
                        C53182ek d6 = m133334d((C64422m) nVar.f174746e);
                        eiVar.copyOnWrite();
                        C53190es esVar8 = (C53190es) eiVar.instance;
                        C53183el elVar6 = (C53183el) d6.build();
                        elVar6.getClass();
                        esVar8.f139400e = elVar6;
                        esVar8.f139399d = 13;
                    }
                    C64419j jVar = nVar.f174747f;
                    if (jVar == null) {
                        jVar = C64419j.f174730e;
                    }
                    C53186eo e = m133335e(jVar);
                    eiVar.copyOnWrite();
                    C53190es esVar9 = (C53190es) eiVar.instance;
                    C53187ep epVar = (C53187ep) e.build();
                    epVar.getClass();
                    esVar9.f139401f = epVar;
                    esVar9.f139396a |= 1;
                    C64419j jVar2 = nVar.f174748g;
                    if (jVar2 == null) {
                        jVar2 = C64419j.f174730e;
                    }
                    C53186eo e2 = m133335e(jVar2);
                    eiVar.copyOnWrite();
                    C53190es esVar10 = (C53190es) eiVar.instance;
                    C53187ep epVar2 = (C53187ep) e2.build();
                    epVar2.getClass();
                    esVar10.f139402g = epVar2;
                    esVar10.f139396a |= 2;
                    C64431v a = C64431v.m96403a(nVar.f174751j);
                    if (a == null) {
                        a = C64431v.UNKNOWN_CASE;
                    }
                    switch (a.ordinal()) {
                        case 0:
                            i2 = 1;
                            break;
                        case 1:
                            i2 = 2;
                            break;
                        case 2:
                            i2 = 3;
                            break;
                        case 3:
                            i2 = 4;
                            break;
                        case 4:
                            i2 = 5;
                            break;
                        case 5:
                            i2 = 6;
                            break;
                        case 6:
                            i2 = 7;
                            break;
                        case 7:
                            i2 = 8;
                            break;
                        case 8:
                            i2 = 9;
                            break;
                        case 9:
                            i2 = 10;
                            break;
                        case 10:
                            i2 = 11;
                            break;
                        case 11:
                            i2 = 12;
                            break;
                        case 12:
                            i2 = 13;
                            break;
                        case 13:
                            i2 = 14;
                            break;
                        case 14:
                            i2 = 15;
                            break;
                        case 15:
                            break;
                        case 16:
                            i2 = 17;
                            break;
                        case 17:
                            i2 = 18;
                            break;
                        case 18:
                            i2 = 19;
                            break;
                        default:
                            throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(a))));
                    }
                    eiVar.copyOnWrite();
                    C53190es esVar11 = (C53190es) eiVar.instance;
                    esVar11.f139408m = i2 - 1;
                    esVar11.f139396a |= 2048;
                    eiVar.copyOnWrite();
                    C53190es esVar12 = (C53190es) eiVar.instance;
                    esVar12.f139413r = 2;
                    esVar12.f139396a |= 524288;
                    optional = Optional.m71637of((C53190es) eiVar.build());
                } catch (NumberFormatException e3) {
                    C59104x d7 = f228266d.mo56226d();
                    d7.mo56378ag(C58975e.f156826a, "OpaSSFlightUtils");
                    ((C59052c) ((C59052c) ((C59052c) d7).mo56382g(e3)).mo56372aa(6849)).mo56389s("Flight number does not contain valid numeric part %s", hVar.f174728b);
                    optional = Optional.empty();
                }
            } else {
                optional = Optional.empty();
            }
            return m133336f(optional);
        } else if (i != 1) {
            return C58485gu.m89845m();
        } else {
            C64408l lVar = (C64408l) iVar2.f152208c;
            C53180ei eiVar2 = (C53180ei) C53190es.f139393s.createBuilder();
            C53178eg egVar2 = (C53178eg) C53179eh.f139366e.createBuilder();
            String str3 = lVar.f174692c;
            egVar2.copyOnWrite();
            C53179eh ehVar4 = (C53179eh) egVar2.instance;
            str3.getClass();
            ehVar4.f139368a |= 1;
            ehVar4.f139369b = str3;
            String str4 = lVar.f174694e;
            egVar2.copyOnWrite();
            C53179eh ehVar5 = (C53179eh) egVar2.instance;
            str4.getClass();
            ehVar5.f139368a |= 2;
            ehVar5.f139370c = str4;
            eiVar2.copyOnWrite();
            C53190es esVar13 = (C53190es) eiVar2.instance;
            C53179eh ehVar6 = (C53179eh) egVar2.build();
            ehVar6.getClass();
            esVar13.f139405j = ehVar6;
            esVar13.f139396a |= 256;
            C53186eo eoVar = (C53186eo) C53187ep.f139383h.createBuilder();
            String str5 = lVar.f174695f;
            eoVar.copyOnWrite();
            C53187ep epVar3 = (C53187ep) eoVar.instance;
            str5.getClass();
            epVar3.f139385a |= 1;
            epVar3.f139386b = str5;
            String str6 = lVar.f174697h;
            eoVar.copyOnWrite();
            C53187ep epVar4 = (C53187ep) eoVar.instance;
            str6.getClass();
            epVar4.f139385a |= 64;
            epVar4.f139391g = str6;
            String str7 = lVar.f174698i;
            eoVar.copyOnWrite();
            C53187ep epVar5 = (C53187ep) eoVar.instance;
            str7.getClass();
            epVar5.f139385a |= 4;
            epVar5.f139387c = str7;
            eiVar2.copyOnWrite();
            C53190es esVar14 = (C53190es) eiVar2.instance;
            C53187ep epVar6 = (C53187ep) eoVar.build();
            epVar6.getClass();
            esVar14.f139401f = epVar6;
            esVar14.f139396a |= 1;
            C53186eo eoVar2 = (C53186eo) C53187ep.f139383h.createBuilder();
            String str8 = lVar.f174696g;
            eoVar2.copyOnWrite();
            C53187ep epVar7 = (C53187ep) eoVar2.instance;
            str8.getClass();
            epVar7.f139385a |= 1;
            epVar7.f139386b = str8;
            String str9 = lVar.f174699j;
            eoVar2.copyOnWrite();
            C53187ep epVar8 = (C53187ep) eoVar2.instance;
            str9.getClass();
            epVar8.f139385a |= 64;
            epVar8.f139391g = str9;
            String str10 = lVar.f174700k;
            eoVar2.copyOnWrite();
            C53187ep epVar9 = (C53187ep) eoVar2.instance;
            str10.getClass();
            epVar9.f139385a |= 4;
            epVar9.f139387c = str10;
            eiVar2.copyOnWrite();
            C53190es esVar15 = (C53190es) eiVar2.instance;
            C53187ep epVar10 = (C53187ep) eoVar2.build();
            epVar10.getClass();
            esVar15.f139402g = epVar10;
            esVar15.f139396a |= 2;
            eiVar2.copyOnWrite();
            C53190es esVar16 = (C53190es) eiVar2.instance;
            esVar16.f139413r = 2;
            esVar16.f139396a |= 524288;
            try {
                int parseInt2 = Integer.parseInt(lVar.f174693d.replaceAll("\\D", BuildConfig.FLAVOR));
                eiVar2.copyOnWrite();
                C53190es esVar17 = (C53190es) eiVar2.instance;
                esVar17.f139396a |= 512;
                esVar17.f139406k = parseInt2;
            } catch (NumberFormatException e4) {
                C59104x d8 = f228266d.mo56226d();
                d8.mo56378ag(C58975e.f156826a, "OpaSSFlightUtils");
                ((C59052c) ((C59052c) ((C59052c) d8).mo56382g(e4)).mo56372aa(6848)).mo56389s("Flight number does not contain valid numeric part %s", lVar.f174693d);
            }
            int i5 = lVar.f174690a;
            if ((262144 & i5) != 0) {
                C53182ek ekVar = (C53182ek) C53183el.f139373c.createBuilder();
                String str11 = lVar.f174704o;
                ekVar.copyOnWrite();
                C53183el elVar7 = (C53183el) ekVar.instance;
                str11.getClass();
                elVar7.f139375a |= 1;
                elVar7.f139376b = str11;
                eiVar2.copyOnWrite();
                C53190es esVar18 = (C53190es) eiVar2.instance;
                C53183el elVar8 = (C53183el) ekVar.build();
                elVar8.getClass();
                esVar18.f139400e = elVar8;
                esVar18.f139399d = 14;
            } else if ((131072 & i5) != 0) {
                C53182ek ekVar2 = (C53182ek) C53183el.f139373c.createBuilder();
                String str12 = lVar.f174703n;
                ekVar2.copyOnWrite();
                C53183el elVar9 = (C53183el) ekVar2.instance;
                str12.getClass();
                elVar9.f139375a |= 1;
                elVar9.f139376b = str12;
                eiVar2.copyOnWrite();
                C53190es esVar19 = (C53190es) eiVar2.instance;
                C53183el elVar10 = (C53183el) ekVar2.build();
                elVar10.getClass();
                esVar19.f139400e = elVar10;
                esVar19.f139399d = 13;
            } else if ((lVar.f174691b & 1) != 0) {
                C53182ek ekVar3 = (C53182ek) C53183el.f139373c.createBuilder();
                String str13 = lVar.f174710u;
                ekVar3.copyOnWrite();
                C53183el elVar11 = (C53183el) ekVar3.instance;
                str13.getClass();
                elVar11.f139375a |= 1;
                elVar11.f139376b = str13;
                eiVar2.copyOnWrite();
                C53190es esVar20 = (C53190es) eiVar2.instance;
                C53183el elVar12 = (C53183el) ekVar3.build();
                elVar12.getClass();
                esVar20.f139400e = elVar12;
                esVar20.f139399d = 13;
            } else if ((i5 & 268435456) != 0) {
                C53182ek ekVar4 = (C53182ek) C53183el.f139373c.createBuilder();
                String str14 = lVar.f174707r;
                ekVar4.copyOnWrite();
                C53183el elVar13 = (C53183el) ekVar4.instance;
                str14.getClass();
                elVar13.f139375a |= 1;
                elVar13.f139376b = str14;
                eiVar2.copyOnWrite();
                C53190es esVar21 = (C53190es) eiVar2.instance;
                C53183el elVar14 = (C53183el) ekVar4.build();
                elVar14.getClass();
                esVar21.f139400e = elVar14;
                esVar21.f139399d = 13;
            }
            int i6 = lVar.f174690a;
            if ((65536 & i6) != 0) {
                C53182ek ekVar5 = (C53182ek) C53183el.f139373c.createBuilder();
                String str15 = lVar.f174702m;
                ekVar5.copyOnWrite();
                C53183el elVar15 = (C53183el) ekVar5.instance;
                str15.getClass();
                elVar15.f139375a |= 1;
                elVar15.f139376b = str15;
                eiVar2.copyOnWrite();
                C53190es esVar22 = (C53190es) eiVar2.instance;
                C53183el elVar16 = (C53183el) ekVar5.build();
                elVar16.getClass();
                esVar22.f139398c = elVar16;
                esVar22.f139397b = 11;
            } else if ((lVar.f174691b & 8) != 0) {
                C53182ek ekVar6 = (C53182ek) C53183el.f139373c.createBuilder();
                String str16 = lVar.f174711v;
                ekVar6.copyOnWrite();
                C53183el elVar17 = (C53183el) ekVar6.instance;
                str16.getClass();
                elVar17.f139375a |= 1;
                elVar17.f139376b = str16;
                eiVar2.copyOnWrite();
                C53190es esVar23 = (C53190es) eiVar2.instance;
                C53183el elVar18 = (C53183el) ekVar6.build();
                elVar18.getClass();
                esVar23.f139398c = elVar18;
                esVar23.f139397b = 10;
            } else if ((524288 & i6) != 0) {
                C53182ek ekVar7 = (C53182ek) C53183el.f139373c.createBuilder();
                String str17 = lVar.f174705p;
                ekVar7.copyOnWrite();
                C53183el elVar19 = (C53183el) ekVar7.instance;
                str17.getClass();
                elVar19.f139375a |= 1;
                elVar19.f139376b = str17;
                eiVar2.copyOnWrite();
                C53190es esVar24 = (C53190es) eiVar2.instance;
                C53183el elVar20 = (C53183el) ekVar7.build();
                elVar20.getClass();
                esVar24.f139398c = elVar20;
                esVar24.f139397b = 10;
            } else if ((1073741824 & i6) != 0) {
                C53182ek ekVar8 = (C53182ek) C53183el.f139373c.createBuilder();
                String str18 = lVar.f174709t;
                ekVar8.copyOnWrite();
                C53183el elVar21 = (C53183el) ekVar8.instance;
                str18.getClass();
                elVar21.f139375a |= 1;
                elVar21.f139376b = str18;
                eiVar2.copyOnWrite();
                C53190es esVar25 = (C53190es) eiVar2.instance;
                C53183el elVar22 = (C53183el) ekVar8.build();
                elVar22.getClass();
                esVar25.f139398c = elVar22;
                esVar25.f139397b = 10;
            } else if ((i6 & 32768) != 0) {
                C53182ek ekVar9 = (C53182ek) C53183el.f139373c.createBuilder();
                String str19 = lVar.f174701l;
                ekVar9.copyOnWrite();
                C53183el elVar23 = (C53183el) ekVar9.instance;
                str19.getClass();
                elVar23.f139375a |= 1;
                elVar23.f139376b = str19;
                eiVar2.copyOnWrite();
                C53190es esVar26 = (C53190es) eiVar2.instance;
                C53183el elVar24 = (C53183el) ekVar9.build();
                elVar24.getClass();
                esVar26.f139398c = elVar24;
                esVar26.f139397b = 10;
            }
            C64406j jVar3 = C64406j.NO_VALUE;
            C64406j a2 = C64406j.m96401a(lVar.f174706q);
            if (a2 == null) {
                a2 = C64406j.NO_VALUE;
            }
            int ordinal = a2.ordinal();
            if (ordinal == 1) {
                eiVar2.copyOnWrite();
                C53190es esVar27 = (C53190es) eiVar2.instance;
                esVar27.f139408m = 1;
                esVar27.f139396a |= 2048;
            } else if (ordinal == 8) {
                eiVar2.copyOnWrite();
                C53190es esVar28 = (C53190es) eiVar2.instance;
                esVar28.f139408m = 5;
                esVar28.f139396a |= 2048;
            } else if (ordinal == 4) {
                eiVar2.copyOnWrite();
                C53190es esVar29 = (C53190es) eiVar2.instance;
                esVar29.f139408m = 10;
                esVar29.f139396a |= 2048;
            } else if (ordinal != 5) {
                eiVar2.copyOnWrite();
                C53190es esVar30 = (C53190es) eiVar2.instance;
                esVar30.f139408m = 0;
                esVar30.f139396a |= 2048;
            } else {
                eiVar2.copyOnWrite();
                C53190es esVar31 = (C53190es) eiVar2.instance;
                esVar31.f139408m = 17;
                esVar31.f139396a |= 2048;
            }
            return m133336f(Optional.m71637of((C53190es) eiVar2.build()));
        }
    }

    /* renamed from: b */
    public static Optional m133333b(String str) {
        try {
            return Optional.m71637of(Long.valueOf(OffsetDateTime.parse(str).toInstant().toEpochMilli()));
        } catch (DateTimeParseException e) {
            C59104x d = f228266d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaSSFlightUtils");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(6850)).mo56389s("Unable to parse flight time %s using OffsetDateTime", str);
            return Optional.empty();
        }
    }

    /* renamed from: d */
    private static C53182ek m133334d(C64422m mVar) {
        C53182ek ekVar = (C53182ek) C53183el.f139373c.createBuilder();
        String str = mVar.f174738a;
        ekVar.copyOnWrite();
        C53183el elVar = (C53183el) ekVar.instance;
        str.getClass();
        elVar.f139375a |= 1;
        elVar.f139376b = str;
        return ekVar;
    }

    /* renamed from: e */
    private static C53186eo m133335e(C64419j jVar) {
        C53186eo eoVar = (C53186eo) C53187ep.f139383h.createBuilder();
        String str = jVar.f174733b;
        eoVar.copyOnWrite();
        C53187ep epVar = (C53187ep) eoVar.instance;
        str.getClass();
        epVar.f139385a |= 1;
        epVar.f139386b = str;
        if ((jVar.f174732a & 8) != 0) {
            String str2 = jVar.f174734c;
            eoVar.copyOnWrite();
            C53187ep epVar2 = (C53187ep) eoVar.instance;
            str2.getClass();
            epVar2.f139385a |= 64;
            epVar2.f139391g = str2;
        }
        if ((jVar.f174732a & 16) != 0) {
            String str3 = jVar.f174735d;
            eoVar.copyOnWrite();
            C53187ep epVar3 = (C53187ep) eoVar.instance;
            str3.getClass();
            epVar3.f139385a |= 4;
            epVar3.f139387c = str3;
        }
        return eoVar;
    }

    /* renamed from: f */
    private static C58485gu m133336f(Optional optional) {
        if (!optional.isPresent()) {
            return C58485gu.m89845m();
        }
        C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
        C83737ai aiVar = (C83737ai) C83738aj.f228226c.createBuilder();
        C53190es esVar = (C53190es) optional.get();
        aiVar.copyOnWrite();
        C83738aj ajVar = (C83738aj) aiVar.instance;
        esVar.getClass();
        ajVar.f228229b = esVar;
        ajVar.f228228a = 4;
        abVar.copyOnWrite();
        C83739ak akVar = (C83739ak) abVar.instance;
        C83738aj ajVar2 = (C83738aj) aiVar.build();
        ajVar2.getClass();
        akVar.f228233b = ajVar2;
        akVar.f228232a |= 1;
        return C58485gu.m89846n((C83739ak) abVar.build());
    }

    /* renamed from: c */
    public final boolean mo77068c() {
        if (this.f228270h.mo79746e(C89985ax.f246724g)) {
            return true;
        }
        long j = this.f228269f.getLong("proactive_smartspace_last_sync_timestamp", -1);
        if (j != -1 && this.f228268e.mo26870b() - j < f228267g) {
            return false;
        }
        return true;
    }
}
