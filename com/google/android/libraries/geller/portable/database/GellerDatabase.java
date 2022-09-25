package com.google.android.libraries.geller.portable.database;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.protos.p4985f.p5030q.p5032b.C65025aj;
import com.google.protos.p4985f.p5030q.p5032b.C65071r;
import com.google.protos.p5129p.p5131b.C65753ak;

/* compiled from: PG */
public interface GellerDatabase {

    /* renamed from: a */
    public static final C58528ij f60554a = new C58759qy(C65753ak.HERON.name());

    /* renamed from: b */
    public static final C58528ij f60555b = new C58759qy(C65753ak.TNG_ASSISTANT_TOP_CONTACTS.name());

    /* renamed from: c */
    public static final C58528ij f60556c = C58528ij.m90015O(C65753ak.GDD_AGSA_GROWTH_TRACKING.name(), C65753ak.GDD_APA_ARC_POP_NLU_MODELS.name(), C65753ak.GDD_APA_BISTO.name(), C65753ak.GDD_APA_BISTO_DEVICE_CUSTOMIZE_INFO.name(), C65753ak.GDD_APA_CORRECTIONS.name(), C65753ak.GDD_APA_DICTATION_FORMATTING.name(), C65753ak.GDD_APA_GENIE_FM.name(), C65753ak.GDD_APA_HEAD_SUGGEST.name(), C65753ak.GDD_APA_HOTMATCH.name(), C65753ak.GDD_APA_HOTWORD_MODEL.name(), C65753ak.GDD_APA_LIGHTWEIGHT_TOKENS.name(), C65753ak.GDD_APA_POP.name(), C65753ak.GDD_APA_SMART_ACTION_MODELS.name(), C65753ak.GDD_APA_UCM_TFL.name(), C65753ak.GDD_APA_WARMACTIONS.name(), C65753ak.GDD_AUTOFILL_VCN_MERCHANT_OPT_OUT.name(), C65753ak.GDD_LENS_AVS.name(), C65753ak.GDD_LENS_TEXT.name(), C65753ak.GDD_MDD_SAMPLE_APP_MULTI_VARIANTS.name(), C65753ak.GDD_MOBSERVE_CODELAB.name(), C65753ak.GDD_NEVER_USE_THIS_SEE_OMG_28475.name(), C65753ak.GDD_NGA_GENIE_FM.name(), C65753ak.GDD_WEBREF.name(), C65753ak.GDD_WEBREF_NGA.name());

    /* renamed from: d */
    public static final C58528ij f60557d = new C58759qy(C65753ak.ENCRYPTED_ONDEVICE_LOCATION_HISTORY.name());

    /* renamed from: e */
    public static final C58528ij f60558e = new C58759qy(C65753ak.PORTABLE_PROVIDER.name());

    /* renamed from: a */
    long mo27243a(String str, C65025aj ajVar);

    /* renamed from: b */
    C58495hd mo27244b(String str, String str2);

    /* renamed from: c */
    void mo27245c();

    /* renamed from: d */
    void mo27246d(byte[] bArr);

    long delete(String str);

    long delete(String str, byte[] bArr);

    long deleteMetadata(String str, String str2);

    byte[] getCorpusStats();

    byte[] getCorpusStats(String[] strArr);

    byte[] getSnapshot(String[] strArr, int i);

    boolean incrementUsage(String str, String str2, long j);

    long markSyncStatus(String str, byte[] bArr);

    byte[][] read(String str, boolean z, boolean z2);

    byte[][] read(String str, byte[] bArr);

    byte[][] readAll(String str);

    byte[] readAndClearKeyUsage(String str, String[] strArr);

    long readDataUsage(String str, String str2, long j);

    String[] readKeys(String str);

    String[] readMetadata(String str, String str2);

    byte[][] readOutdatedData(String str);

    long softDelete(String str, C65071r rVar);

    long softDelete(String str, byte[] bArr);

    boolean write(String str, String[] strArr, long j, boolean z, byte[] bArr);

    byte[] write(byte[] bArr);

    boolean writeMetadata(String str, String str2, String str3);
}
