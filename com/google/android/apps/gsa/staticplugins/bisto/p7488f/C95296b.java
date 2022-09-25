package com.google.android.apps.gsa.staticplugins.bisto.p7488f;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142353ce;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.f.b */
/* compiled from: PG */
final class C95296b {

    /* renamed from: b */
    private static final C58495hd f266632b;

    /* renamed from: a */
    C142353ce f266633a;

    /* renamed from: c */
    private final C124548d f266634c;

    /* renamed from: d */
    private final C142324bc f266635d;

    /* renamed from: e */
    private Locale f266636e;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(4, C58485gu.m89848p(Integer.valueOf(R.string.interruptive_summary_messaging_1), Integer.valueOf(R.string.interruptive_summary_messaging_2), Integer.valueOf(R.string.interruptive_summary_messaging_3)));
        gzVar.mo55429h(5, C58485gu.m89848p(Integer.valueOf(R.string.interruptive_summary_non_messaging_1), Integer.valueOf(R.string.interruptive_summary_non_messaging_2), Integer.valueOf(R.string.interruptive_summary_non_messaging_3)));
        gzVar.mo55429h(6, C58485gu.m89848p(Integer.valueOf(R.string.interruptive_summary_group_messaging_1), Integer.valueOf(R.string.interruptive_summary_group_messaging_2), Integer.valueOf(R.string.interruptive_summary_group_messaging_3)));
        gzVar.mo55429h(9, C58485gu.m89846n(Integer.valueOf(R.string.expand_rain_drop_messaging)));
        gzVar.mo55429h(10, C58485gu.m89846n(Integer.valueOf(R.string.expand_rain_drop_non_messaging)));
        gzVar.mo55429h(11, C58485gu.m89846n(Integer.valueOf(R.string.expand_rain_drop_group_messaging)));
        gzVar.mo55429h(13, C58485gu.m89846n(Integer.valueOf(R.string.voice_query_no_speech_follow_on)));
        gzVar.mo55429h(14, C58485gu.m89847o(Integer.valueOf(R.string.transcript_success_1), Integer.valueOf(R.string.transcript_success_2)));
        gzVar.mo55429h(23, C58485gu.m89847o(Integer.valueOf(R.string.default_instruction), Integer.valueOf(R.string.voice_query_empty_prompt_2)));
        gzVar.mo55429h(24, C58485gu.m89846n(Integer.valueOf(R.string.voice_query_no_speech_follow_on_retry)));
        gzVar.mo55429h(25, C58485gu.m89846n(Integer.valueOf(R.string.voice_query_failed)));
        f266632b = gzVar.mo55427f(false);
    }

    public C95296b(C124548d dVar, C142324bc bcVar) {
        this.f266634c = dVar;
        this.f266635d = bcVar;
    }

    /* renamed from: c */
    public static List m157528c(int i) {
        return (List) f266632b.get(Integer.valueOf(i));
    }

    /* renamed from: e */
    private static String m157530e(List list, int i) {
        if (i <= 0 || list.size() < i) {
            return null;
        }
        return (String) list.get(i - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Integer mo89223a(int i, int i2) {
        List c = m157528c(i);
        if (c == null || i2 <= 0 || i2 > c.size()) {
            return null;
        }
        return (Integer) c.get(i2 - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo89224b(Context context, int i, int i2) {
        Locale locale = Locale.getDefault();
        if (!locale.equals(this.f266636e)) {
            this.f266636e = locale;
            if (this.f266635d == null) {
                this.f266633a = null;
            } else {
                String language = locale.getLanguage();
                String g = C124525f.m203991g(locale);
                Iterator it = this.f266635d.f386122h.iterator();
                C142353ce ceVar = null;
                C142353ce ceVar2 = null;
                while (true) {
                    if (it.hasNext()) {
                        C142353ce ceVar3 = (C142353ce) it.next();
                        String h = C124525f.m203992h(ceVar3.f386251b);
                        if (g.equalsIgnoreCase(h)) {
                            this.f266633a = ceVar3;
                            break;
                        } else if (language.equalsIgnoreCase(h)) {
                            ceVar = ceVar3;
                        } else if ("en_US".equals(h)) {
                            ceVar2 = ceVar3;
                        }
                    } else {
                        if (ceVar == null) {
                            ceVar = ceVar2;
                        }
                        this.f266633a = ceVar;
                    }
                }
            }
        }
        C142353ce ceVar4 = this.f266633a;
        if (ceVar4 == null) {
            return null;
        }
        return m157529d(context, ceVar4, i, i2);
    }

    /* renamed from: d */
    private final String m157529d(Context context, C142353ce ceVar, int i, int i2) {
        if (i == 1) {
            return m157530e(ceVar.f386256g, i2);
        }
        if (i == 3) {
            return m157530e(ceVar.f386253d, i2);
        }
        if (i != 12) {
            if (i == 19) {
                return m157530e(ceVar.f386255f, i2);
            }
            if (i != 26) {
                if (i == 7) {
                    return m157530e(ceVar.f386254e, i2);
                }
                if (i == 8) {
                    return m157530e(ceVar.f386252c, i2);
                }
                if (i != 15) {
                    if (i != 16) {
                        switch (i) {
                            case 21:
                                return m157530e(ceVar.f386257h, i2);
                            case 22:
                                if (i2 != 1 || (ceVar.f386250a & 32) == 0) {
                                    return null;
                                }
                                return ceVar.f386261l;
                            case 23:
                                C124548d dVar = this.f266634c;
                                if (dVar != null && dVar.mo106513k() == C124719q.CAR_ACCESSORY) {
                                    return null;
                                }
                                if (i2 == 1) {
                                    if ((ceVar.f386250a & 8) != 0) {
                                        return ceVar.f386260k;
                                    }
                                    i2 = 1;
                                }
                                Integer a = mo89223a(i, i2);
                                if (a == null) {
                                    return null;
                                }
                                return context.getString(a.intValue());
                            default:
                                return null;
                        }
                    } else if (i2 != 1) {
                        return null;
                    } else {
                        if ((ceVar.f386250a & 4) != 0) {
                            return ceVar.f386259j;
                        }
                        return m157529d(context, ceVar, 15, 1);
                    }
                } else if (i2 != 1) {
                    return null;
                } else {
                    if ((ceVar.f386250a & 2) != 0) {
                        return ceVar.f386258i;
                    }
                    return m157529d(context, ceVar, 21, 1);
                }
            } else if (i2 != 1 || (ceVar.f386250a & 64) == 0) {
                return null;
            } else {
                return ceVar.f386262m;
            }
        } else if (i2 != 1 || (ceVar.f386250a & 8) == 0) {
            return null;
        } else {
            return ceVar.f386260k;
        }
    }
}
